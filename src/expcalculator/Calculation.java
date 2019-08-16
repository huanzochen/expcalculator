package expcalculator;

public class Calculation {
	private double exp;
	private final int level;

	Calculation(double level) {
		this.level = 0;
		this.exp = 17;
	}

	public double getExpCalculated(double level) {
		if (level == 0) {
			return exp;
		}
		else if (level <= 10) {
			exp += (level * 17);
			System.out.println(level + "等需要" + (level * 17) + "的經驗值");
		}
		else if (level > 10 && level <= 17) {
			exp += ((level * 15) * (level * 0.12));
			System.out.println(level + "等需要" + ((level * 15) * (level * 0.12)) + "的經驗值");
		}
		else if (level > 17 && level <= 25) {
			exp += ((level * 15) * (level * 0.2));
			System.out.println(level + "等需要" + ((level * 15) * (level * 0.2)) + "的經驗值");
		}
		return getExpCalculated(level - 1);


	}

}
