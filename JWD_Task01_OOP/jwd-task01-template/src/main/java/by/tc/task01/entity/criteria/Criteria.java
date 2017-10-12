package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Criteria<E> {

	private String applianceType;
	private Map<E, Object> criteria = new HashMap<>();

	public String getApplianceType() {
		return applianceType;
	}

	public void setApplianceType(String applianceType) {
		this.applianceType = applianceType;
	}

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public boolean isEmpty() {
		return criteria.isEmpty();
	}

	public Object get(final E key) {
		return criteria.get(key);
	}

	public Map<E, Object> getMap() {
		return criteria;
	}

	public Set<Map.Entry<E, Object>> getEntrySet() {
		return criteria.entrySet();
	}
}
