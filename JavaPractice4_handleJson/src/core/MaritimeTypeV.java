package core;

public class MaritimeTypeV extends Vehicle {
	
	private int lenght;
	private int beam;
	private int flotationDate; // YA LUEGO SI ESO UNA CLASSE DATE CHICOS
	private String date0fManufacture;
	
	public MaritimeTypeV(String id, char type, double median_speed, double consumption_per_km, 
					double max_capacity, double actual_loading, double min_consumption, int lenght, int beam, int flotationDate, String date0fManufacture) {

		super.identificador = id;
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

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getBeam() {
		return beam;
	}

	public void setBeam(int beam) {
		this.beam = beam;
	}

	public int getFlotationDate() {
		return flotationDate;
	}

	public void setFlotationDate(int flotationDate) {
		this.flotationDate = flotationDate;
	}

	public String getDate0fManufacture() {
		return date0fManufacture;
	}

	public void setDate0fManufacture(String date0fManufacture) {
		this.date0fManufacture = date0fManufacture;
	}
	
	

}
