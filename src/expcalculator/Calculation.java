package expcalculator;

public class Calculation {
	private double exp;
	double lvl1Sum,lvl2Sum,lvl3Sum;


	Calculation(double level) {
		this.exp = 17;
	}

	public double getExpCalculated(int level) {
		if (level == 0) {
			System.out.println( "���q�һݸg��" + lvl1Sum);
			System.out.println( "���q�һݸg��" + lvl2Sum);
			System.out.println( "���q�һݸg��" + lvl3Sum);
			return exp;
		}
		else if (level <= 10) {
			exp += lvl1(level);
			System.out.println(level + "���ݭn" + lvl1(level) + "���g���");
		}
		else if (level > 10 && level <= 17) {
			exp += lvl2(level);
			System.out.println(level + "���ݭn" + lvl2(level) + "���g���");
		}
		else if (level > 17 && level <= 25) {
			exp += lvl3(level);
			System.out.println(level + "���ݭn" + lvl3(level) + "���g���");
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
