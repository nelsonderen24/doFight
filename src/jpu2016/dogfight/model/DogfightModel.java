package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel  extends Observable implements IDogfightModel {
	
	private Sky sky;
	private ArrayList<IMobile> mobiles;

	public DogfightModel() {
		this.setSky(new Sky(null));
	}

	

	public Sky getSky() {
		return sky;
	}

	public void setSky(Sky sky) {
		this.sky = sky;
	}



	@Override
	public IArea getArea() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void buildArea(Dimension dimension) {
		
		
	}



	@Override
	public void addMobile(IMobile Mobile) {
		
		
	}



	@Override
	public void removeMobile(IMobile Mobile) {
		
		
	}



	@Override
	public ArrayList<IMobile> getMobiles() {
		
		return null;
	}



	@Override
	public IMobile getMobileByPlayer(int player) {
		
		return null;
	}



	@Override
	public void setMobilesHavesMoved() {
		
		
	}



	
	public void setMobiles(ArrayList<IMobile> mobiles) {
		this.mobiles = mobiles;
	}

}
