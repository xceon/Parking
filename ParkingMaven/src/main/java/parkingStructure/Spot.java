package parkingStructure;

import vehicles.Vehicle;

public class Spot {

	private Vehicle vehicle;
	private SpotType spotType;
	private int row;
	private int level;
	
	public Spot(Vehicle vehicle, SpotType spotType, int row, int level) {
		
		this.vehicle = vehicle;
		this.spotType = spotType;
		this.row = row;
		this.level = level;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public SpotType getSpotType() {
		return this.spotType;
	}

	public void setSpotType(SpotType spotType) {
		this.spotType = spotType;
	}

	public int getRow() {
		return this.row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public boolean isSpotUsed() {
		return this.vehicle == null;
	}
	
	public boolean canUseThisSpot() {
		
		return true;
	}
	
}
