package com;

import java.util.ArrayList;

public class TestDriver {

	public static void main(String[] args) {
		Driver driver1= new Driver( "Auto",1, "divisha",1000.0);
        Driver driver2 = new Driver( "Car",2, "pallavi",2000.0);
        Driver driver3 = new Driver("Lorry",3, "chintu" ,3000.0);
        Driver driver4= new Driver( "Auto",4, "sweety",1000.0);
        Driver driver5 = new Driver( "Car",5, "chinnu",2000.0);
        Driver driver6 = new Driver("Lorry",6, "Bunny" ,3000.0);
        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        drivers.add(driver4);
        
        drivers.add(driver5);
        drivers.add(driver6);
        Travel travel=new Travel();
        System.out.println("Is  car driver ? " + travel.isCarDriver(driver6));
        System.out.println("Driver ID : " + travel.retrieveByDriverId(drivers, 2));
        System.out.println("Count of drivers: " + travel.retrieveCountOfDriver(drivers, "Car"));
        System.out.println("Car drivers: " + travel.retrieveDriver(drivers, "Car"));
        System.out.println("Max distance traveled driver: " + travel.retrieveMaximumDistanceTravelledDriver(drivers).getDriverName());

        


	}

}
