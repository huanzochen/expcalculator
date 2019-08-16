package expcalculator;

public class Calculation {
	private double exp;
	double lvl1Sum = 0,lvl2Sum = 0,lvl3Sum = 0;


	Calculation(double level) {
		this.exp = 0;
	}

	public double getExpCalculated(int level) {
		if (level == 0) {
			System.out.println( "1階段所需經驗" + lvl1Sum);
			System.out.println( "2階段所需經驗" + lvl2Sum);
			System.out.println( "3階段所需經驗" + lvl3Sum);
			return exp;
		}
		else if (level <= 10) {
			exp += lvl1(level);
			lvl1Sum += lvl1(level);
			System.out.println(level + "等需要" + lvl1(level) + "的經驗值");
		}
		else if (level > 10 && level <= 17) {
			exp += lvl2(level);
			lvl2Sum += lvl2(level);
			System.out.println(level + "等需要" + lvl2(level) + "的經驗值");
		}
		else if (level > 17 && level <= 25) {
			exp += lvl3(level);
			lvl3Sum += lvl3(level);
			System.out.println(level + "等需要" + lvl3(level) + "的經驗值");
		}
		System.out.println("累積經驗 " + exp);
		return getExpCalculated(level - 1);
	}

	public double lvl1 (int level) {
		return Math.round(level * 23);
	}
	public double lvl2 (int level) {
		return Math.round((level * 15) * (level * 0.22));
	}
	public double lvl3 (int level) {
		return Math.round((level * 15) * (level * 0.32));
	}

}
