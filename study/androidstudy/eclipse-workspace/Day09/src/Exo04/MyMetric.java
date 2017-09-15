package Exo04;

public class MyMetric{
	public final static double MILE_IN_KILO = 1.609344;
	public static double kiloToMile(double kilo) {
		return kilo/MILE_IN_KILO;
	}
	public static double mileToKilo(double mile) {
		return mile*MILE_IN_KILO;
	}
}