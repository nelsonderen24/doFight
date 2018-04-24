package jpu2016.dogfight.model;

public interface IDogfightModel {

	public IArea getArea();
	
	public void buildArea(Dimension dimension);
	
	public void addMobile(Imobile Mobile);
	
	public ArrayList<IMobile> getMobiles();
	
}
