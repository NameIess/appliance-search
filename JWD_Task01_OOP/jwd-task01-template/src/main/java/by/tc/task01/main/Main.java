package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

public class Main {

	public static void main(String[] args) throws IOException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		positiveTest(service);
		negativeTest(service);
	}

	public static void positiveTest(ApplianceService service) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException {
		Appliance appliance;

		by.tc.task01.entity.Oven oven;
		by.tc.task01.entity.Laptop laptop;
		by.tc.task01.entity.Refrigerator refrigerator;
		by.tc.task01.entity.Speakers speakers;
		by.tc.task01.entity.TabletPC tabletPC;
		by.tc.task01.entity.VacuumCleaner vacuumCleaner;

		/////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<>();

		criteriaOven.setApplianceType("Oven");
		criteriaOven.add(Oven.POWER_CONSUMPTION, 1000);
		criteriaOven.add(Oven.WEIGHT, 10);
		criteriaOven.add(Oven.CAPACITY, 32);
		criteriaOven.add(Oven.DEPTH, 60);
		criteriaOven.add(Oven.HEIGHT, 45.5);
		criteriaOven.add(Oven.WIDTH, 59.5);

		appliance = service.find(criteriaOven);
		PrintApplianceInfo.print(appliance);

		oven = (by.tc.task01.entity.Oven) appliance;
		if (appliance.getClass() == by.tc.task01.entity.Oven.class && oven.getPowerConsumption() == 1000) {
			System.out.println("Passed!\n");
		}


		criteriaOven = new Criteria<>();
		criteriaOven.setApplianceType("Oven");
		criteriaOven.add(Oven.POWER_CONSUMPTION, 1500);
		criteriaOven.add(Oven.WEIGHT, 12);
		criteriaOven.add(Oven.CAPACITY, 33);
		criteriaOven.add(Oven.DEPTH, 60);
		criteriaOven.add(Oven.HEIGHT, 45);
		criteriaOven.add(Oven.WIDTH, 68);

		appliance = service.find(criteriaOven);
		PrintApplianceInfo.print(appliance);

		oven = (by.tc.task01.entity.Oven) appliance;
		if (appliance.getClass() == by.tc.task01.entity.Oven.class && oven.getCapacity() == 33) {
			System.out.println("Passed!\n");
		}


		criteriaOven = new Criteria<>();
		criteriaOven.setApplianceType("Oven");
		criteriaOven.add(Oven.POWER_CONSUMPTION, 2000);
		criteriaOven.add(Oven.WEIGHT, 11);
		criteriaOven.add(Oven.CAPACITY, 33);
		criteriaOven.add(Oven.DEPTH, 60);
		criteriaOven.add(Oven.HEIGHT, 40);
		criteriaOven.add(Oven.WIDTH, 70);

		appliance = service.find(criteriaOven);
		PrintApplianceInfo.print(appliance);

		oven = (by.tc.task01.entity.Oven) appliance;
		if (appliance.getClass() == by.tc.task01.entity.Oven.class && oven.getWidth() == 70) {
			System.out.println("Passed!\n");
		}

		////////////////////////////////////////////////////

		Criteria<Laptop> criteriaLaptop = new Criteria<>();

		criteriaLaptop.setApplianceType("Laptop");
<<<<<<< HEAD
		criteriaLaptop.add(Laptop.BATTERY_CAPACITY, 1);
=======
		criteriaLaptop.add(Laptop.BATTERY_CAPACITY, 10.100);
>>>>>>> 76848fe6c6405f049a4011955e700b640b28c87e
		criteriaLaptop.add(Laptop.OS, "Windows");
		criteriaLaptop.add(Laptop.MEMORY_ROM, 4000);
		criteriaLaptop.add(Laptop.SYSTEM_MEMORY, 1000);
		criteriaLaptop.add(Laptop.CPU, 1.2);
		criteriaLaptop.add(Laptop.DISPLAY_INCHS, 18);

		appliance = service.find(criteriaLaptop);
		PrintApplianceInfo.print(appliance);

		laptop = (by.tc.task01.entity.Laptop) appliance;
<<<<<<< HEAD
		if (appliance.getClass() == by.tc.task01.entity.Laptop.class && laptop.getBatteryCapacity() == 1.00) {
=======
		if (appliance.getClass() == by.tc.task01.entity.Laptop.class && laptop.getBatteryCapacity() == 10.100) {
>>>>>>> 76848fe6c6405f049a4011955e700b640b28c87e
			System.out.println("Passed!\n");
		}

		criteriaLaptop = new Criteria<>();
		criteriaLaptop.setApplianceType("Laptop");
		criteriaLaptop.add(Laptop.BATTERY_CAPACITY, 1.5);
		criteriaLaptop.add(Laptop.OS, "Linux");
		criteriaLaptop.add(Laptop.MEMORY_ROM, 8000);
		criteriaLaptop.add(Laptop.SYSTEM_MEMORY, 1000);
		criteriaLaptop.add(Laptop.CPU, 2.2);
		criteriaLaptop.add(Laptop.DISPLAY_INCHS, 19);

		appliance = service.find(criteriaLaptop);
		PrintApplianceInfo.print(appliance);

		laptop = (by.tc.task01.entity.Laptop) appliance;
		if (appliance.getClass() == by.tc.task01.entity.Laptop.class && laptop.getCpu() == 2.2) {
			System.out.println("Passed!\n");
		}

		criteriaLaptop = new Criteria<>();
		criteriaLaptop.setApplianceType("Laptop");
		criteriaLaptop.add(Laptop.BATTERY_CAPACITY, 3);
		criteriaLaptop.add(Laptop.OS, "Windows");
		criteriaLaptop.add(Laptop.MEMORY_ROM, 8000);
		criteriaLaptop.add(Laptop.SYSTEM_MEMORY, 1500);
		criteriaLaptop.add(Laptop.CPU, 3.2);
		criteriaLaptop.add(Laptop.DISPLAY_INCHS, 22);

		appliance = service.find(criteriaLaptop);
		PrintApplianceInfo.print(appliance);

		laptop = (by.tc.task01.entity.Laptop) appliance;
		if (appliance.getClass() == by.tc.task01.entity.Laptop.class && laptop.getOs().equals("Windows")) {
			System.out.println("Passed!\n");
		}

		///////////////////////////////////////////////////

		Criteria<Refrigerator> criteriaRefrigerator = new Criteria<>();

		criteriaRefrigerator.add(Refrigerator.POWER_CONSUMPTION, 100);
		criteriaRefrigerator.add(Refrigerator.WEIGHT, 20);
		criteriaRefrigerator.add(Refrigerator.FREEZER_CAPACITY, 10);
		criteriaRefrigerator.add(Refrigerator.OVERALL_CAPACITY, 300);
		criteriaRefrigerator.add(Refrigerator.HEIGHT, 200);
		criteriaRefrigerator.add(Refrigerator.WIDTH, 70);

		appliance = service.find(criteriaRefrigerator);
		PrintApplianceInfo.print(appliance);

		refrigerator = (by.tc.task01.entity.Refrigerator) appliance;
		if (appliance.getClass() == by.tc.task01.entity.Refrigerator.class && refrigerator.getOverallCapacity() == 300) {
			System.out.println("Passed!\n");
		}

		criteriaRefrigerator = new Criteria<>();
		criteriaRefrigerator.add(Refrigerator.POWER_CONSUMPTION, 200);
		criteriaRefrigerator.add(Refrigerator.WEIGHT, 30);
		criteriaRefrigerator.add(Refrigerator.FREEZER_CAPACITY, 15);
		criteriaRefrigerator.add(Refrigerator.OVERALL_CAPACITY, 300);
		criteriaRefrigerator.add(Refrigerator.HEIGHT, 180);
		criteriaRefrigerator.add(Refrigerator.WIDTH, 80);

		appliance = service.find(criteriaRefrigerator);
		PrintApplianceInfo.print(appliance);

		refrigerator = (by.tc.task01.entity.Refrigerator) appliance;
		if (appliance.getClass() == by.tc.task01.entity.Refrigerator.class && refrigerator.getHeight() == 180) {
			System.out.println("Passed!\n");
		}

		criteriaRefrigerator = new Criteria<>();
		criteriaRefrigerator.add(Refrigerator.POWER_CONSUMPTION, 150);
		criteriaRefrigerator.add(Refrigerator.WEIGHT, 35);
		criteriaRefrigerator.add(Refrigerator.FREEZER_CAPACITY, 20);
		criteriaRefrigerator.add(Refrigerator.OVERALL_CAPACITY, 350.5);
		criteriaRefrigerator.add(Refrigerator.HEIGHT, 250);
		criteriaRefrigerator.add(Refrigerator.WIDTH, 75);

		appliance = service.find(criteriaRefrigerator);
		PrintApplianceInfo.print(appliance);

		refrigerator = (by.tc.task01.entity.Refrigerator) appliance;
		if (appliance.getClass() == by.tc.task01.entity.Refrigerator.class && refrigerator.getFreezerCapacity() == 20) {
			System.out.println("Passed!\n");
		}

		///////////////////////////////////////////////////

		Criteria<VacuumCleaner> criteriaVacuumCleaner = new Criteria<>();

		criteriaVacuumCleaner.add(VacuumCleaner.POWER_CONSUMPTION, 100);
		criteriaVacuumCleaner.add(VacuumCleaner.FILTER_TYPE, "A");
		criteriaVacuumCleaner.add(VacuumCleaner.BAG_TYPE, "A2");
		criteriaVacuumCleaner.add(VacuumCleaner.WAND_TYPE, "all-in-one");
		criteriaVacuumCleaner.add(VacuumCleaner.MOTOR_SPEED_REGULATION, 3000);
		criteriaVacuumCleaner.add(VacuumCleaner.CLEANING_WIDTH, 20);

		appliance = service.find(criteriaVacuumCleaner);
		PrintApplianceInfo.print(appliance);

		vacuumCleaner = (by.tc.task01.entity.VacuumCleaner) appliance;
		if (appliance.getClass() == by.tc.task01.entity.VacuumCleaner.class && vacuumCleaner.getBagType().equals("A2")) {
			System.out.println("Passed!\n");
		}

		criteriaVacuumCleaner = new Criteria<>();
		criteriaVacuumCleaner.add(VacuumCleaner.POWER_CONSUMPTION, 110);
		criteriaVacuumCleaner.add(VacuumCleaner.FILTER_TYPE, "B");
		criteriaVacuumCleaner.add(VacuumCleaner.BAG_TYPE, "AA-89");
		criteriaVacuumCleaner.add(VacuumCleaner.WAND_TYPE, "all-in-one");
		criteriaVacuumCleaner.add(VacuumCleaner.MOTOR_SPEED_REGULATION, 2900);
		criteriaVacuumCleaner.add(VacuumCleaner.CLEANING_WIDTH, 25);

		appliance = service.find(criteriaVacuumCleaner);
		PrintApplianceInfo.print(appliance);

		vacuumCleaner = (by.tc.task01.entity.VacuumCleaner) appliance;
		if (appliance.getClass() == by.tc.task01.entity.VacuumCleaner.class && vacuumCleaner.getWandType().equals("all-in-one")) {
			System.out.println("Passed!\n");
		}

		criteriaVacuumCleaner = new Criteria<>();
		criteriaVacuumCleaner.add(VacuumCleaner.POWER_CONSUMPTION, 90);
		criteriaVacuumCleaner.add(VacuumCleaner.FILTER_TYPE, "C");
		criteriaVacuumCleaner.add(VacuumCleaner.BAG_TYPE, "XX00");
		criteriaVacuumCleaner.add(VacuumCleaner.WAND_TYPE, "all-in-one");
		criteriaVacuumCleaner.add(VacuumCleaner.MOTOR_SPEED_REGULATION, 2950);
		criteriaVacuumCleaner.add(VacuumCleaner.CLEANING_WIDTH, 30);

		appliance = service.find(criteriaVacuumCleaner);
		PrintApplianceInfo.print(appliance);

		vacuumCleaner = (by.tc.task01.entity.VacuumCleaner) appliance;
		if (appliance.getClass() == by.tc.task01.entity.VacuumCleaner.class && vacuumCleaner.getMotorSpeedRegulation() == 2950) {
			System.out.println("Passed!\n");
		}

		///////////////////////////////////////////////////

		Criteria<TabletPC> criteriaTabletPC = new Criteria<>();

		criteriaTabletPC.add(TabletPC.BATTERY_CAPACITY, 3);
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);
		criteriaTabletPC.add(TabletPC.FLASH_MEMORY_CAPACITY, 2);
		criteriaTabletPC.add(TabletPC.COLOR, "blue");

		appliance = service.find(criteriaTabletPC);
		PrintApplianceInfo.print(appliance);

		tabletPC = (by.tc.task01.entity.TabletPC) appliance;
		if (appliance.getClass() == by.tc.task01.entity.TabletPC.class && tabletPC.getColor().equals("blue")) {
			System.out.println("Passed!\n");
		}

		criteriaTabletPC = new Criteria<>();
		criteriaTabletPC.add(TabletPC.BATTERY_CAPACITY, 4);
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 15);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);
		criteriaTabletPC.add(TabletPC.FLASH_MEMORY_CAPACITY, 6);
		criteriaTabletPC.add(TabletPC.COLOR, "red");

		appliance = service.find(criteriaTabletPC);
		PrintApplianceInfo.print(appliance);

		tabletPC = (by.tc.task01.entity.TabletPC) appliance;
		if (appliance.getClass() == by.tc.task01.entity.TabletPC.class && tabletPC.getMemoryRom() == 8000) {
			System.out.println("Passed!\n");
		}

		criteriaTabletPC = new Criteria<>();
		criteriaTabletPC.add(TabletPC.BATTERY_CAPACITY, 5);
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 16);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 16000);
		criteriaTabletPC.add(TabletPC.FLASH_MEMORY_CAPACITY, 8);
		criteriaTabletPC.add(TabletPC.COLOR, "green");

		appliance = service.find(criteriaTabletPC);
		PrintApplianceInfo.print(appliance);

		tabletPC = (by.tc.task01.entity.TabletPC) appliance;
		if (appliance.getClass() == by.tc.task01.entity.TabletPC.class && tabletPC.getDisplayInches() == 16) {
			System.out.println("Passed!\n");
		}

		///////////////////////////////////////////////////

		Criteria<Speakers> criteriaSpeakers = new Criteria<>();

		criteriaSpeakers.add(Speakers.POWER_CONSUMPTION, 15);
		criteriaSpeakers.add(Speakers.NUMBER_OF_SPEAKERS, 2);
		criteriaSpeakers.add(Speakers.FREQUENCY_RANGE, "2-4");
		criteriaSpeakers.add(Speakers.CORD_LENGTH, 2);

		appliance = service.find(criteriaSpeakers);
		PrintApplianceInfo.print(appliance);

		speakers = (by.tc.task01.entity.Speakers) appliance;
		if (appliance.getClass() == by.tc.task01.entity.Speakers.class && speakers.getCordLength() == 2) {
			System.out.println("Passed!\n");
		}

		criteriaSpeakers = new Criteria<>();
		criteriaSpeakers.add(Speakers.POWER_CONSUMPTION, 20);
		criteriaSpeakers.add(Speakers.NUMBER_OF_SPEAKERS, 3);
		criteriaSpeakers.add(Speakers.FREQUENCY_RANGE, "3-4");
		criteriaSpeakers.add(Speakers.CORD_LENGTH, 3);

		appliance = service.find(criteriaSpeakers);
		PrintApplianceInfo.print(appliance);

		speakers = (by.tc.task01.entity.Speakers) appliance;
		if (appliance.getClass() == by.tc.task01.entity.Speakers.class && speakers.getFrequencyRange().equals("3-4")) {
			System.out.println("Passed!\n");
		}

		criteriaSpeakers = new Criteria<>();
		criteriaSpeakers.add(Speakers.POWER_CONSUMPTION, 17);
		criteriaSpeakers.add(Speakers.NUMBER_OF_SPEAKERS, 4);
		criteriaSpeakers.add(Speakers.FREQUENCY_RANGE, "2-3.5");
		criteriaSpeakers.add(Speakers.CORD_LENGTH, 4);

		appliance = service.find(criteriaSpeakers);
		PrintApplianceInfo.print(appliance);

		speakers = (by.tc.task01.entity.Speakers) appliance;
		if (appliance.getClass() == by.tc.task01.entity.Speakers.class && speakers.getPowerConsumption() == 17) {
			System.out.println("Passed!\n");
		}

<<<<<<< HEAD
		System.out.println("End of the positive test\n\n");
=======
		System.out.println("\nEnd of the positive test----------------------------------\n");
>>>>>>> 76848fe6c6405f049a4011955e700b640b28c87e

	}

	public static void negativeTest(ApplianceService service) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException {
		Appliance appliance;

		by.tc.task01.entity.Oven oven;
		by.tc.task01.entity.Laptop laptop;
		by.tc.task01.entity.Refrigerator refrigerator;
		by.tc.task01.entity.Speakers speakers;
		by.tc.task01.entity.TabletPC tabletPC;
		by.tc.task01.entity.VacuumCleaner vacuumCleaner;

		/////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<>();

		criteriaOven.setApplianceType("Oven");
		criteriaOven.add(Oven.POWER_CONSUMPTION, "1000");
		criteriaOven.add(Oven.WEIGHT, "10");
		criteriaOven.add(Oven.CAPACITY, "32");
		criteriaOven.add(Oven.DEPTH, "60");
		criteriaOven.add(Oven.HEIGHT, "45.5");
		criteriaOven.add(Oven.WIDTH, "59.5");

		appliance = service.find(criteriaOven);
		PrintApplianceInfo.print(appliance);

		oven = (by.tc.task01.entity.Oven) appliance;
		if (appliance.getClass() == by.tc.task01.entity.Oven.class && oven.getPowerConsumption() == 1000) {
			System.out.println("Passed!\n");
		}


		criteriaOven = new Criteria<>();
		criteriaOven.setApplianceType("Oven");
		criteriaOven.add(Oven.CAPACITY, "33.0");
		criteriaOven.add(Oven.WIDTH, 68);

		appliance = service.find(criteriaOven);
		PrintApplianceInfo.print(appliance);

		oven = (by.tc.task01.entity.Oven) appliance;
		if (appliance.getClass() == by.tc.task01.entity.Oven.class && oven.getCapacity() == 33) {
			System.out.println("Passed!\n");
		}


		////////////////////////////////////////////////////

		Criteria<Laptop> criteriaLaptop = new Criteria<>();

		criteriaLaptop.setApplianceType("Laptop");
<<<<<<< HEAD
		criteriaLaptop.add(Laptop.BATTERY_CAPACITY, 1);
=======
		criteriaLaptop.add(Laptop.BATTERY_CAPACITY, 10.100000);
>>>>>>> 76848fe6c6405f049a4011955e700b640b28c87e
		criteriaLaptop.add(Laptop.OS, "WinDoWS");
		criteriaLaptop.add(Laptop.MEMORY_ROM, 4000);

		appliance = service.find(criteriaLaptop);
		PrintApplianceInfo.print(appliance);

		laptop = (by.tc.task01.entity.Laptop) appliance;
<<<<<<< HEAD
		if (appliance.getClass() == by.tc.task01.entity.Laptop.class && laptop.getBatteryCapacity() == 1.0) {
=======
		if (appliance.getClass() == by.tc.task01.entity.Laptop.class && laptop.getBatteryCapacity() == 10.100) {
>>>>>>> 76848fe6c6405f049a4011955e700b640b28c87e
			System.out.println("Passed!\n");
		}

		criteriaLaptop = new Criteria<>();
		criteriaLaptop.setApplianceType("Laptop");
		criteriaLaptop.add(Laptop.BATTERY_CAPACITY, 1.5);
		criteriaLaptop.add(Laptop.OS, "  Linux        ");
		criteriaLaptop.add(Laptop.MEMORY_ROM, 8_0_0_0);
		criteriaLaptop.add(Laptop.SYSTEM_MEMORY, 1000);
		criteriaLaptop.add(Laptop.CPU, 2.2);
		criteriaLaptop.add(Laptop.DISPLAY_INCHS, 19);

		appliance = service.find(criteriaLaptop);
		PrintApplianceInfo.print(appliance);

		laptop = (by.tc.task01.entity.Laptop) appliance;
		if (appliance.getClass() == by.tc.task01.entity.Laptop.class && laptop.getCpu() == 2.2) {
			System.out.println("Passed!\n");
		}

		criteriaLaptop = new Criteria<>();
		criteriaLaptop.setApplianceType("Laptop");
		criteriaLaptop.add(Laptop.BATTERY_CAPACITY, 3);
		criteriaLaptop.add(Laptop.OS, "Windows");
		criteriaLaptop.add(Laptop.MEMORY_ROM, 8000);
		criteriaLaptop.add(Laptop.SYSTEM_MEMORY, 1500);
		criteriaLaptop.add(Laptop.CPU, 3.2);
		criteriaLaptop.add(Laptop.DISPLAY_INCHS, 22);

		appliance = service.find(criteriaLaptop);
		PrintApplianceInfo.print(appliance);

		laptop = (by.tc.task01.entity.Laptop) appliance;
		if (appliance.getClass() == by.tc.task01.entity.Laptop.class && laptop.getOs().equals("Windows")) {
			System.out.println("Passed!\n");
		}

		///////////////////////////////////////////////////

		Criteria<Refrigerator> criteriaRefrigerator = new Criteria<>();

		criteriaRefrigerator.add(Refrigerator.POWER_CONSUMPTION, null);
		criteriaRefrigerator.add(Refrigerator.WEIGHT, 20);
		criteriaRefrigerator.add(Refrigerator.FREEZER_CAPACITY, 10);
		criteriaRefrigerator.add(Refrigerator.OVERALL_CAPACITY, 300);
		criteriaRefrigerator.add(Refrigerator.HEIGHT, 200);
		criteriaRefrigerator.add(Refrigerator.WIDTH, 70);

		appliance = service.find(criteriaRefrigerator);
		PrintApplianceInfo.print(appliance);

		refrigerator = (by.tc.task01.entity.Refrigerator) appliance;
		if (appliance == null) {
			System.out.println("Passed!\n");
		}

		criteriaRefrigerator = new Criteria<>();
		criteriaRefrigerator.add(null, 200);
		criteriaRefrigerator.add(Refrigerator.WEIGHT, 30);
		criteriaRefrigerator.add(Refrigerator.FREEZER_CAPACITY, 15);
		criteriaRefrigerator.add(Refrigerator.OVERALL_CAPACITY, 300);
		criteriaRefrigerator.add(Refrigerator.HEIGHT, 180);
		criteriaRefrigerator.add(Refrigerator.WIDTH, 80);

		appliance = service.find(criteriaRefrigerator);
		PrintApplianceInfo.print(appliance);

		refrigerator = (by.tc.task01.entity.Refrigerator) appliance;
		if (appliance == null) {
			System.out.println("Passed!\n");
		}

		criteriaRefrigerator = new Criteria<>();
		criteriaRefrigerator.add(null, null);
		criteriaRefrigerator.add(Refrigerator.WEIGHT, 35);
		criteriaRefrigerator.add(Refrigerator.FREEZER_CAPACITY, 20);
		criteriaRefrigerator.add(Refrigerator.OVERALL_CAPACITY, 350.5);
		criteriaRefrigerator.add(Refrigerator.HEIGHT, 250);
		criteriaRefrigerator.add(Refrigerator.WIDTH, 75);

		appliance = service.find(criteriaRefrigerator);
		PrintApplianceInfo.print(appliance);

		refrigerator = (by.tc.task01.entity.Refrigerator) appliance;
		if (appliance == null) {
			System.out.println("Passed!\n");
		}

		///////////////////////////////////////////////////

		Criteria<VacuumCleaner> criteriaVacuumCleaner = new Criteria<>();

		appliance = service.find(criteriaVacuumCleaner);
		PrintApplianceInfo.print(appliance);

		vacuumCleaner = (by.tc.task01.entity.VacuumCleaner) appliance;
		if (appliance == null) {
			System.out.println("Passed!\n");
		}

		criteriaVacuumCleaner = new Criteria<>();
		criteriaVacuumCleaner.add(VacuumCleaner.FILTER_TYPE, "20!8");

		appliance = service.find(criteriaVacuumCleaner);
		PrintApplianceInfo.print(appliance);

		vacuumCleaner = (by.tc.task01.entity.VacuumCleaner) appliance;
		if (appliance == null) {
			System.out.println("Passed!\n");
		}

		criteriaVacuumCleaner = new Criteria<>();
		criteriaVacuumCleaner.add(VacuumCleaner.POWER_CONSUMPTION, "20FA8");
		criteriaVacuumCleaner.add(VacuumCleaner.FILTER_TYPE, "C");
		criteriaVacuumCleaner.add(VacuumCleaner.MOTOR_SPEED_REGULATION, 2950);

		appliance = service.find(criteriaVacuumCleaner);
		PrintApplianceInfo.print(appliance);

		vacuumCleaner = (by.tc.task01.entity.VacuumCleaner) appliance;
		if (appliance == null) {
			System.out.println("Passed!\n");
		}

		///////////////////////////////////////////////////

		Criteria<TabletPC> criteriaTabletPC = new Criteria<>();

		criteriaTabletPC.add(TabletPC.BATTERY_CAPACITY, "123ASD");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, "14REF");
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, "8000DOG");
		criteriaTabletPC.add(TabletPC.FLASH_MEMORY_CAPACITY, "KI55");
		criteriaTabletPC.add(TabletPC.COLOR, "BLU3");

		appliance = service.find(criteriaTabletPC);
		PrintApplianceInfo.print(appliance);

		tabletPC = (by.tc.task01.entity.TabletPC) appliance;
		if (appliance == null) {
			System.out.println("Passed!\n");
		}

		criteriaTabletPC = new Criteria<>();
		criteriaTabletPC.add(TabletPC.BATTERY_CAPACITY, 4.0000000);
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 15.000000);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000.000);
		criteriaTabletPC.add(TabletPC.FLASH_MEMORY_CAPACITY, 6.00000000);

		appliance = service.find(criteriaTabletPC);
		PrintApplianceInfo.print(appliance);

		tabletPC = (by.tc.task01.entity.TabletPC) appliance;
		if (appliance.getClass() == by.tc.task01.entity.TabletPC.class && tabletPC.getMemoryRom() == 8000) {
			System.out.println("Passed!\n");
		}

<<<<<<< HEAD
		criteriaTabletPC = new Criteria<>();
		criteriaTabletPC.add(TabletPC.BATTERY_CAPACITY, 2018);
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 88);

		appliance = service.find(criteriaTabletPC);
		PrintApplianceInfo.print(appliance);

		tabletPC = (by.tc.task01.entity.TabletPC) appliance;
		if (appliance == null) {
			System.out.println("Passed!\n");
		}


		System.out.println("End of the negative test\n\n");
=======

		System.out.println("\nEnd of the negative test----------------------------------\n");
>>>>>>> 76848fe6c6405f049a4011955e700b640b28c87e

	}
}
