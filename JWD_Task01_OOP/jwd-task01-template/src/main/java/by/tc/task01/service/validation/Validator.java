package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	private static final String LOGGER_ERROR_REPORT = "Error during validation: ";
	private static final String STRING_FIELDS = "OS, FILTER_TYPE, BAG_TYPE, WAND_TYPE, FREQUENCY_RANGE, COLOR";

	public static <E> boolean criteriaValidator(Criteria<E> criteria) {

		if (criteria.isEmpty()) {
			System.out.println(LOGGER_ERROR_REPORT + "There is no any objects inside query.");
			return false;
		}

		for (Map.Entry<E, Object> map : criteria.getEntrySet()) {
			if (map.getKey() == null || map.getValue() == null) {
				System.out.println(LOGGER_ERROR_REPORT + "There is null value inside query.");
				return false;
			}
		}

		Pattern p = Pattern.compile("^([a-zA-Z0-9. \\-]+)");
		for (Map.Entry<E, Object> map : criteria.getEntrySet()) {
			Matcher m = p.matcher(map.getValue().toString());
			if (!m.matches() || map.getValue().toString().trim().length() == 0) {
				System.out.println(LOGGER_ERROR_REPORT + "The query: [ " + map.getValue() + " ] has wrong format.");
				return false;
			}
		}

		for (Map.Entry<E, Object> map : criteria.getEntrySet()) {
			if (!NumberUtils.isNumber(map.getValue().toString()) && !STRING_FIELDS.contains(map.getKey().toString())) {
				System.out.println(LOGGER_ERROR_REPORT + "There is incorrect numbers inside the query.");
				return false;
			}
		}

		return true;
	}
}