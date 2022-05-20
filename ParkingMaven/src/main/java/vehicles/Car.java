package vehicles;

import parkingStructure.SpotType;

public class Car extends Vehicle {
	
	public Car() {
		spaceNeeded = 1;
		spotType = SpotType.Compact;
	}
}
