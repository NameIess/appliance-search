package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.lang.reflect.InvocationTargetException;

public class PrintApplianceInfo {

	private static final String SUCCESS_RESPONSE = "The object has been found: ";
	private static final String FAILURE_RESPONSE = "The object has not been found!";

	public static void print(Appliance appliance) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

		if (appliance != null) {
			System.out.println(SUCCESS_RESPONSE + appliance.toString());
		} else {
			System.out.println(FAILURE_RESPONSE);
		}
	}
}
