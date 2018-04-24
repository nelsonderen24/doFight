package jpu2016.dogfight.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

public class GamePanel implements Observer {
	
	private IGraphicsBuilder graphicsBuilder;

public GamePanel (IGraphicsBuilder graphicBuilder){
	
}


public void paintComponent (Graphics graphic) {
	
}



@Override
public void update(Observable observable, Object arg1) {
	// TODO Auto-generated method stub
	
}


public IGraphicsBuilder getGraphicsBuilder() {
	return graphicsBuilder;
}


public void setGraphicsBuilder(IGraphicsBuilder graphicsBuilder) {
	this.graphicsBuilder = graphicsBuilder;
}
}
