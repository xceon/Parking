package vehicles;

import parkingStructure.SpotType;

public abstract class Vehicle {
	
	protected SpotType spotType;
	
	protected int spaceNeeded;

	public SpotType getType() {
		return spotType;
	}

	public void setType(SpotType type) {
		this.spotType = type;
	}

	public int getSpaceNeeded() {
		return spaceNeeded;
	}

	public void setSpaceNeeded(int spaceNeeded) {
		this.spaceNeeded = spaceNeeded;
	}
	
	public void parkVehicle() {
		
	}
	
}