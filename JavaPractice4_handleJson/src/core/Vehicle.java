package core;

public abstract class Vehicle {


	protected double min_consumption;
	protected double actual_loading;
	protected double max_capacity;
	protected double consumption_per_km;
	protected char vehicle_type;
	protected String identificador;
	protected double median_speed;
	protected String crewmanId;

	
	
	abstract double totalConsumption();


	public double getMin_consumption() {
		return min_consumption;
	}


	public void setMin_consumption(double min_consumption) {
		this.min_consumption = min_consumption;
	}


	public double getActual_loading() {
		return actual_loading;
	}


	public void setActual_loading(double actual_loading) {
		this.actual_loading = actual_loading;
	}
	
	
	public double getMax_capacity() {
		return max_capacity;
	}


	public void setMax_capacity(double max_capacity) {
		this.max_capacity = max_capacity;
	}


	public double getConsumption_per_km() {
		return consumption_per_km;
	}


	public void setConsumption_per_km(double consumption_per_km) {
		this.consumption_per_km = consumption_per_km;
	}


	public char getVehicle_type() {
		return vehicle_type;
	}


	public void setVehicle_type(char vehicle_type) {
		this.vehicle_type = vehicle_type;
	}


	public String getIdentificador() {
		return identificador;
	}


	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}


	public double getMedian_speed() {
		return median_speed;
	}


	public void setMedian_speed(double median_speed) {
		this.median_speed = median_speed;
	}


	public String getCrewmanId() {
		return crewmanId;
	}


	public void setCrewmanId(String crewmanId) {
		this.crewmanId = crewmanId;
	}
	
	//get-set
	
}
