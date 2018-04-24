package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile {
	
	private int speed;
	private Direction direction;
	private Position position;
	private Dimension dimension;
	private Image[] images;
	
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.setImages(new Image[4]);
	}


	@Override
	public Direction getDirection() {
		
		return null;
	}


	@Override
	public void setDirection(Direction direction) {
		
		
	}


	@Override
	public Point getPositon() {
		
		return null;
	}


	@Override
	public Dimension getDimension() {

		return null;
	}


	@Override
	public int getWidth() {
		return 0;
	}


	@Override
	public int getHeight() {
		return 0;
	}


	@Override
	public int getSpeed() {
		return 0;
	}


	@Override
	public Image getImage() {
		return null;
	}


	@Override
	public void move() {
		
	}


	@Override
	public void placeInAera(IArea aera) {
		
	}


	@Override
	public boolean isPlayer(int player) {
		return false;
	}


	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		
	}


	@Override
	public boolean hit() {
		return false;
	}


	@Override
	public boolean isWeapon() {
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

	@Override
	public DogfightModel getDogfightModel() {
		return null;
		
	}


	/**
	 * @return the images
	 */
	public Image[] getImages() {
		return images;
	}


	/**
	 * @param images the images to set
	 */
	public void setImages(Image[] images) {
		this.images = images;
	}
	
	
	
}
