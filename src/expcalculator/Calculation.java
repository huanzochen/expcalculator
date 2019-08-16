package expcalculator;

public class Calculation {
	private double exp;
	double lvl1Sum,lvl2Sum,lvl3Sum;


	Calculation(double level) {
		this.exp = 17;
	}

	public double getExpCalculated(int level) {
		if (level == 0) {
			System.out.println( "階段所需經驗" + lvl1Sum);
			System.out.println( "階段所需經驗" + lvl2Sum);
			System.out.println( "階段所需經驗" + lvl3Sum);
			return exp;
		}
		else if (level <= 10) {
			exp += lvl1(level);
			System.out.println(level + "等需要" + lvl1(level) + "的經驗值");
		}
		else if (level > 10 && level <= 17) {
			exp += lvl2(level);
			System.out.println(level + "等需要" + lvl2(level) + "的經驗值");
		}
		else if (level > 17 && level <= 25) {
			exp += lvl3(level);
			System.out.println(level + "等需要" + lvl3(level) + "的經驗值");
		}
		return getExpCalculated(level - 1);
	}

	public double lvl1 (int level) {
		double exp = 0;
		exp += Math.round(level * 17);
		lvl1Sum += Math.round(level * 17);
		return exp;
	}
	public double lvl2 (int level) {
		double exp = 0;
		exp += Math.round((level * 15) * (level * 0.12));
		lvl2Sum += Math.round(level * 17);
		return exp;
	}
	public double lvl3 (int level) {
		double exp = 0;
		exp += Math.round((level * 15) * (level * 0.2));
		lvl3Sum += Math.round(level * 17);
		return exp;
	}

}
