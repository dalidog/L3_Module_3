package abstract_classes.cities;

public class Atlanta extends City {

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double a = 2*this.getGrowthRate()*this.getPopulation();
		// TODO Auto-generated method stub
		return a;
	}

}
