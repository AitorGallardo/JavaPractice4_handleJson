package core;

public class AirTypeV extends Vehicle {
	
	private int numberOfEngines;
	private int operatingTime;

	public AirTypeV(String id, char type, double median_speed, double consumption_per_km, 
					double max_capacity, double actual_loading, double min_consumption, int numberOfEngines, int operatingTime) {

		super.identificador = id;
		super.vehicle_type = type;
		super.median_speed = median_speed;
		super.consumption_per_km = consumption_per_km;
		super.max_capacity = max_capacity;
		super.actual_loading = actual_loading;
		super.min_consumption = min_consumption;
		this.numberOfEngines = numberOfEngines;
		this.operatingTime =operatingTime;

	}

	@Override
	double totalConsumption() {
			double totalConsumption = super.min_consumption + ((super.actual_loading / super.max_capacity) * super.consumption_per_km) + (this.numberOfEngines * this.operatingTime);
		return totalConsumption;
	}

	public int getNumberOfEngines() {
		return numberOfEngines;
	}

	public void setNumberOfEngines(int numberOfEngines) {
		this.numberOfEngines = numberOfEngines;
	}

	public int getOperatingTime() {
		return operatingTime;
	}

	public void setOperatingTime(int operatingTime) {
		this.operatingTime = operatingTime;
	}
	
	

}
