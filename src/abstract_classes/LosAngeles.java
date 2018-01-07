package abstract_classes;

public class LosAngeles extends City {

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double l =this.getGrowthRate()*.5*this.getPopulation()*this.getGrowthRate();
		// TODO Auto-generated method stub
		return l;
	}

}
