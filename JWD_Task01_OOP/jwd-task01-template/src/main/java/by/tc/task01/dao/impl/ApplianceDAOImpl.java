package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO{

	private static final String FILE_NAME = System.getProperty("user.dir") + "/JWD_Task01_OOP/jwd-task01-template/src/main/resources/appliances_db.txt";
	private static final String BASE_PACKAGE = "by.tc.task01.entity.";

	@Override
	public <E> Appliance find(Criteria<E> criteria) throws IOException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
		try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
			String line = br.readLine();

			while (line != null) {
				boolean pointer = false;
				for (Map.Entry<E, Object> map : criteria.getEntrySet()) {

					if (!line.contains(map.getKey().getClass().getSimpleName())) {
						line = br.readLine();
						break;
					} else {
						String validLine = line.replaceAll(";", ",").replaceAll("\\.0*,", ",");
						String queryStr = map.getKey() + "=" + map.getValue().toString().trim().replaceAll("\\.0*$", "") + ",";

						if (StringUtils.containsIgnoreCase(validLine, queryStr)) {
							pointer = true;
						} else {
							line = br.readLine();
							pointer = false;
							break;
						}
					}
				}

				if (pointer) {
					break;
				} else {
					if (line == null) {
						return null;
					}
				}
			}

			String className = BASE_PACKAGE + line.replaceAll(" .*", "");
			String[] response = line.replaceAll(".*: ", "").replaceAll(";", "").split(", ");

			Map<String, String> initMap = new HashMap<>();

			for (String pair : response) {
				String[] keyValue = pair.split("=");
				initMap.put(keyValue[0], keyValue[1]);
			}

			Class cls = null;
			try {
				cls = Class.forName(className);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			return (Appliance) cls.getConstructor(Map.class).newInstance(initMap);
		}
	}
}