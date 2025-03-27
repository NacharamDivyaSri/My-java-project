package com;

import java.util.ArrayList;

public class Travel {
	
	public  boolean isCarDriver(Driver driver ) {
		return driver.getCategory().equalsIgnoreCase("car");
	}
	
	public  String retrieveByDriverId(ArrayList<Driver> drivers, int id) {
        for (Driver driver : drivers) {
            if (driver.getDriverId() == id) {
            	return "Driver name is " + driver.getDriverName() + "Belonging to category "+ driver.getCategory() +"traveld"+ driver.getTotalDistance() + "KM so far.";
            }
        }
        
        return "Driver not found";
    }


	public  int retrieveCountOfDriver(ArrayList<Driver> drivers, String category) {
        int count = 0;
        for (Driver driver : drivers) {
            if (driver.getCategory().equalsIgnoreCase(category)) {
                count++;
            }
        }
        return count;
    }

	public  ArrayList<Driver> retrieveDriver(ArrayList<Driver> drivers, String category) {
        ArrayList<Driver> result = new ArrayList<>();
        for (Driver driver : drivers) {
            if (driver.getCategory().equalsIgnoreCase(category)) {
                result.add(driver);
            }
        }
        return result;
    }

	 public  Driver retrieveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers) {
	        Driver maxDriver = drivers.get(0);
	        for (Driver driver : drivers) {
	            if (driver.getTotalDistance() > maxDriver.getTotalDistance()) {
	                maxDriver = driver;
	            }
	        }
	        return maxDriver;
	    }

	
	
	}



