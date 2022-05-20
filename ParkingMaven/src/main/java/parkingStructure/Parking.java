package parkingStructure;

import java.util.ArrayList;
import java.util.List;

import vehicles.Vehicle;

public class Parking {

	List<Spot> motorcycleSpotList = new ArrayList<Spot>();
	List<Spot> compactSpotList = new ArrayList<Spot>();
	List<Spot> largeSpotList = new ArrayList<Spot>();

	int emptyMotorcycleSpot;
	int emptyCompactSpot;
	int emptyLargeSpot;

	public Parking(int emptyMotorcycleSpot, int emptyCompactSpot, int emptyLargeSpot) {
		this.emptyMotorcycleSpot = emptyMotorcycleSpot;
		this.emptyCompactSpot = emptyCompactSpot;
		this.emptyLargeSpot = emptyLargeSpot;
	}
	
	
	public void parkVehicle(Vehicle vehicle) {
		
	}
	
	
	public void removeVehicle(Vehicle vehicle) {
		
	}
}
