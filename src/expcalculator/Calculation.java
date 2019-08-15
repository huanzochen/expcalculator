package expcalculator;

public class Calculation {
	private double exp;

	Calculation(double level){
	}

	public double getExpCalculated(double level) {
		if(level > 3) {
			for(int i = 1; i <= level; i++) {
				exp += 174 + (i * 37);
			}
		}
		return (level - 1) * 17;
	}

}
