package _03_Intro_to_Enums;

public enum StatesOfMatter {

	SOLID(0.0), LIQUID(25.55), GAS(100.0);
	double celsiusTemp;
	private StatesOfMatter(double celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}
	public Double convertToFahrenheit(double celsiusTemp) {
		double convertOne = celsiusTemp * 1.8;
		convertOne+=32;
		return convertOne;
	}
}
