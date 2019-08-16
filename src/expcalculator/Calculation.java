package expcalculator;

public class Calculation {
	private double exp;
	double lvl1Sum = 0,lvl2Sum = 0,lvl3Sum = 0;


	Calculation(double level) {
		this.exp = 0;
	}

	public double getExpCalculated(int level) {
		if (level == 0) {
			System.out.println( "1���q�һݸg��" + lvl1Sum);
			System.out.println( "2���q�һݸg��" + lvl2Sum);
			System.out.println( "3���q�һݸg��" + lvl3Sum);
			return exp;
		}
		else if (level <= 10) {
			exp += lvl1(level);
			lvl1Sum += lvl1(level);
			System.out.println(level + "���ݭn" + lvl1(level) + "���g���");
		}
		else if (level > 10 && level <= 17) {
			exp += lvl2(level);
			lvl2Sum += lvl2(level);
			System.out.println(level + "���ݭn" + lvl2(level) + "���g���");
		}
		else if (level > 17 && level <= 25) {
			exp += lvl3(level);
			lvl3Sum += lvl3(level);
			System.out.println(level + "���ݭn" + lvl3(level) + "���g���");
		}
		System.out.println("�ֿn�g�� " + exp);
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
