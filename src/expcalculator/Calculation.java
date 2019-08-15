package expcalculator;

public class Calculation {
	private double exp;
	private int level;

	Calculation(double level) {
		this.level = 0;
		this.exp = 0;
	}

	public double getExpCalculated(double level) {
		if (level == 0) {
			return exp;
		}

		if (level <= 10) {
			exp += 17;
		}

		if (level > 10) {
			for (int i = 1; i <= level; i++) {
				exp += 174 + (i * 37);
			}
		}

		if (level > 17) {
			for (int i = 1; i <= level; i++) {
				exp += 174 + (i * 37);
			}
		}

		return getExpCalculated(level - 1);

	}

}
