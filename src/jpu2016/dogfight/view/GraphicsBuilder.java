package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.model.DogfightModel;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;

public class GraphicsBuilder {

	private DogfightModel dogfightModel = new DogfightModel();
	private BufferedImage emptySky;
	
	public GraphicsBuilder(IDogfightModel dogfightModel) {
	//	this.setEmptySky(new BufferedImage());
		
	}
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {
		
	}
	private void buildEmptySky() {
		
	}
	private void drawmobile(IMobile mobile, Graphics graphics, ImageObserver observer) {
		
	}
	public int getGlobalWidth() {
		return 0;
		
	}
	public int getGlobalHeight() {
		return 0;
		
	}
	
	public DogfightModel getDogfightModel() {
		return dogfightModel;
	}
	
	public void setDogfightModel(DogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}
	
	public BufferedImage getEmptySky() {
		return emptySky;
	}
	
	public void setEmptySky(BufferedImage emptySky) {
		this.emptySky = emptySky;
	}
}