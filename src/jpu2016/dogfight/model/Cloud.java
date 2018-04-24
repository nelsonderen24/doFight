package jpu2016.dogfight.model;

public class Cloud {
	
	private static int SPEED = 1;
	private static int WIDTH = 300;
	private static int HEIGHT = 150;
	private static String IMAGE ="cloud";
	
	
	
	
	public Cloud(Direction direction, Dimension dimension) {
		
	}
	
	public static int getSPEED() {
		return SPEED;
	}
	public static void setSPEED(int sPEED) {
		SPEED = sPEED;
	}




	public static int getWIDTH() {
		return WIDTH;
	}




	public static void setWIDTH(int wIDTH) {
		WIDTH = wIDTH;
	}
	public static int getHEIGHT() {
		return HEIGHT;
	}
	public static void setHEIGHT(int hEIGHT) {
		HEIGHT = hEIGHT;
	}
	public static String getIMAGE() {
		return IMAGE;
	}
	public static void setIMAGE(String iMAGE) {
		IMAGE = iMAGE;
	}
     
}
