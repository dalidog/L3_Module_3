package abstract_classes.cities;

public class LosAngeles extends City {

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double l =this.getPopulation()*this.getGrowthRate()+this.getGrowthRate()*.5;
		// TODO Auto-generated method stub
		return l;
	}

}
