package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile {
	
	private int speed;
	private Direction direction;
	private Position position;
	private Dimension dimension;
	
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		
	}
	
	public Direction getDirection() {
		return direction;
		
	}
	
	public void setDirection(Direction direction) {
		
	}

	public Point getPosition() {
		return null;
		
	}
	
	public Dimension getDimension() {
		return dimension;
		
	}
	
	public int getSpeed() {
		return speed;
		
	}
	
	public int getWidth() {
		return speed;
		
	}
	
	public int getHeigh() {
		return speed;
		
	}
	
	public void move() {
		
	}
	
	public void placeInArea(IArea area ) {
		
	}
	
	public boolean isPlayer(int player) {
		return false;
		
	}
	
	private void moveUP() {
		
	}
	
	private void moveRight() {
		
	}
	
	private void moveDown() {
		
	}
	
	private void moveLeft() {
		
	}
	
	public Color getColor() {
		return null;
		
	}
	
	public IDogfightModel getDogfightModel() {
		return null;
		
	}
	
	public void setDogfightModel(DogfightModel dogfightModel){
		
	}
	
	public boolean hit() {
		return false;
		
	}
	
	public boolean isWeapon() {
		return false;
		
	}
	
	public Image getImage() {
		return null;
		
	}
	
	
}
