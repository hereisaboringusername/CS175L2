
public class RoachPopulation {
	double population;
	
	public RoachPopulation(int initialPop) {
		population = initialPop;
	}

	public void breed() { // method
		population = population * 2;
	}

	public void spray(double sprayPct) { // method
		population = (population * sprayPct) - population;
	}
	
	public double getRoaches() { // method
	        return population;
	}

}
		

	
	
	
	