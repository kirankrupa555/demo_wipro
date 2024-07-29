package com.assignments;

public class Bike extends AbstractManufacturer implements Vehicle {
	 public Bike(String name, String modelName, String bikeType) {
		 super(name,modelName,bikeType);
	 }
	 /*
	 Method returns maximum speed depending upon their types
	 For Sports-300kmh
	 For cruiser-170kmh
	 */
	 @Override
	 public int maxSpeed(String bikeType) {
		 if(bikeType.equals("Sports")) {
			 return 300;
		 }
		 else if(bikeType.equals("cruiser"))
		 {
			 return 170;
		 }
		 else {
			 return 0;
		 }
	 }
	 /*
	 should return in the format : Bike{Manufacturer name:'name',Model
	Name:'modelName',Type:'type'}
	*/
 @Override
 public String getManufacturerInformation() {
 return "Bike{Manufacturer name: "+getName()+"ModelName: "+getModelName()+"Type:"+getType()+"}";
 }
}
