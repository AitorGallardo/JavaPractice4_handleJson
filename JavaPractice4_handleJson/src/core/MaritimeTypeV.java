package core;

public class MaritimeTypeV extends Vehicle {
	
	private int lenght;
	private int beam;
	private int flotationDate; // YA LUEGO SI ESO UNA CLASSE DATE CHICOS
	private int date0fManufacture;
	
	public MaritimeTypeV(String id, char type, double median_speed, double consumption_per_km, 
					double max_capacity, double actual_loading, double min_consumption, int lenght, int beam, int flotationDate, int date0fManufacture) {

		super.indentificador = id;
		super.vehicle_type = type;
		super.median_speed = median_speed;
		super.consumption_per_km = consumption_per_km;
		super.max_capacity = max_capacity;
		super.actual_loading = actual_loading;
		super.min_consumption = min_consumption;
		this.lenght = lenght;
		this.beam =beam;
		this.flotationDate =flotationDate;
		this.date0fManufacture =date0fManufacture;

	}

	@Override
	double totalConsumption() {
		// TODO Auto-generated method stub
		return 0;
	}

}
