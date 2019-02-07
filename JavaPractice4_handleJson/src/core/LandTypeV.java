package core;

public class LandTypeV extends Vehicle {
	
	private int horsePower;
	private int numberOfBreakdows;
	private int priceOfBreakdowns;

	public LandTypeV(String id, char type, double median_speed, double consumption_per_km, 
					double max_capacity, double actual_loading, double min_consumption, int horsePower, int numberOfBreakdows, int priceOfBreakdowns) {

		super.indentificador = id;
		super.vehicle_type = type;
		super.median_speed = median_speed;
		super.consumption_per_km = consumption_per_km;
		super.max_capacity = max_capacity;
		super.actual_loading = actual_loading;
		super.min_consumption = min_consumption;
		this.horsePower = horsePower;
		this.numberOfBreakdows =numberOfBreakdows;
		this.priceOfBreakdowns =priceOfBreakdowns;

	}

	@Override
	double totalConsumption() {
		double totalConsumption = super.min_consumption + ((super.actual_loading / super.max_capacity) * super.consumption_per_km) + (this.numberOfBreakdows * this.priceOfBreakdowns);
		return totalConsumption;
	}

}
