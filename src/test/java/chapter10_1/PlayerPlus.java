package chapter10_1;

import java.text.DecimalFormat;

public class PlayerPlus extends Player {

	private static int playercount = 0;
	private static double totalOfAverage = .000;
	private static DecimalFormat decFormat = new DecimalFormat();

	static {
		decFormat.setMaximumIntegerDigits(0);
		decFormat.setMaximumFractionDigits(3);
		decFormat.setMinimumFractionDigits(3);
	}

	public PlayerPlus(String name, double average) {
		super(name, average);
		playercount++;
		totalOfAverage += average;
		// TODO Auto-generated constructor stub
	}

	public static double findTeamAverage() {
		return totalOfAverage / playercount;
	}

	public static String findTeamAverageString() {
		return decFormat.format(totalOfAverage / playercount);
	}

}
