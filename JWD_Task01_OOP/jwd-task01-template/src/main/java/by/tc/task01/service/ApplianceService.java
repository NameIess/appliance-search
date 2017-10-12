package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public interface ApplianceService {	
	
	<E> Appliance find(Criteria<E> criteria) throws IOException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException;
	
}
