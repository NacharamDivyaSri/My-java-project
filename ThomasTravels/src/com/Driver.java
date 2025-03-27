package com;

public class Driver {
  private  String category;
  private  int DriverId;
  private  String DriverName;
  private  double totalDistance;

public Driver(String category, int driverId, String driverName, double totalDistance) {
	super();
	this.category = category;
	DriverId = driverId;
	DriverName = driverName;
	this.totalDistance = totalDistance;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getDriverId() {
	return DriverId;
}
public void setDriverId(int driverId) {
	DriverId = driverId;
}
public String getDriverName() {
	return DriverName;
}
public void setDriverName(String driverName) {
	DriverName = driverName;
}
public double getTotalDistance() {
	return totalDistance;
}
public void setTotalDistance(double totalDistance) {
	this.totalDistance = totalDistance;
}
@Override
public String toString() {
	return "Driver [category=" + category + ", DriverId=" + DriverId + ", DriverName=" + DriverName + ", totalDistance="
			+ totalDistance + "]";
}

  
  
}
