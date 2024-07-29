package com.assignments;

public class VehicleService {
	 /*
	 create a Car object and return it
	 */
	 public Car createCar(String name, String modelName, String type) {
	 return new Car(name,modelName, type);
	 }
	 /*
	 create a bike object and return it
	 */
	 public Bike createBike(String name, String modelName, String type) {
	 return new Bike(name, modelName, type);
	 }
	 /*
	 Method should compare the speed only if the vehicle is of "SPORTS"
	type.
	 Method should return 0 when speeds are equal otherwise should return
	maximum vehicle speed.
	 Method returns -1 if the type is not "SPORTS"
	 */
	 public int compareMaxSpeed(Vehicle first, Vehicle second) {
	 /*
	 Vehicle objects should be downcasted to their respective concrete
	types
	5
	 */
		 if (first instanceof Car && second instanceof Car) {
			 Car firstCar = (Car) first;
		     Car secondCar = (Car) second;
		         if (firstCar.getType().equalsIgnoreCase("sports") && secondCar.getType().equalsIgnoreCase("sports")) {
		               int firstSpeed = firstCar.maxSpeed(firstCar.getType());
		               int secondSpeed = secondCar.maxSpeed(secondCar.getType());
		                if (firstSpeed == secondSpeed) {
		                    return 0;
		                } else {
		                    return Math.max(firstSpeed, secondSpeed);
		                }
		         }
		} else if (first instanceof Bike && second instanceof Bike) {
		            Bike firstBike = (Bike) first;
		            Bike secondBike = (Bike) second;
		            if (firstBike.getType().equalsIgnoreCase("sports") && secondBike.getType().equalsIgnoreCase("sports")) {
		                int firstSpeed = firstBike.maxSpeed(firstBike.getType());
		                int secondSpeed = secondBike.maxSpeed(secondBike.getType());
		                if (firstSpeed == secondSpeed) {
		                    return 0;
		                } else {
		                    return Math.max(firstSpeed, secondSpeed);
		                }
		            }
		        }
		        return -1;
		    }
    }
     
	