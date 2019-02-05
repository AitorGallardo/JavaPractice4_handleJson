package core;

public class LandTypeV extends Vehicle {
	
	private int horsePower;
	private int numberOfBreakdows;
	private int priceOfBreakdowns;

	@Override
	double totalConsumption() {
		double totalConsumption = super.min_consumption + ((super.actual_loading / super.max_capacity) * super.consumption_per_km) + (this.numberOfBreakdows * this.priceOfBreakdowns);
		return totalConsumption;
	}

}
