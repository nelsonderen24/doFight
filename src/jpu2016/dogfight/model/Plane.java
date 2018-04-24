package jpu2016.dogfight.model;

public class Plane extends Mobile {
	
	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	
	private int player;
	
	public Plane(int player, Direction direction, Position position, String image) {
		super(direction, position, null, SPEED, image);
	}
	
	public boolean isPlayer(int player) {
		return false;
	}
	
	public boolean hit() {
		return false;
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

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}
}
