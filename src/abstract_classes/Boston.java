package abstract_classes.cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double b = this.getPopulation()*this.getGrowthRate()+this.getPopulation()*.5;
		// TODO Auto-generated method stub
		return b;
	}

}
