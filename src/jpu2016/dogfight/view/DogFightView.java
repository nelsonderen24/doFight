package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.gameframe.GameFrame;
import jpu2016.dogfight.gameframe.IEventPerformer;
import jpu2016.dogfight.gameframe.IGraphicsBuilder;
import jpu2016.dogfight.model.IDogfightModel;



public class DogFightView implements IviewSystem, Runnable {
	
	private GameFrame gameFrame;
	private EventPerformer eventPerformer;
	private GraphicsBuilder graphicsBuilder;
	
	public DogFightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
		this.setEventPerformer(new EventPerformer(orderPerformer));
		this.setGraphicsBuilder(new GraphicsBuilder(dogfightModel));
		this.setGameFrame(new GameFrame("test", eventPerformer, graphicsBuilder, observable));
	}


	public void displayMessage(String message) {
	
	}

	public void closeAll() {

	}


	public EventPerformer getEventPerformer() {
		return eventPerformer;
	}


	public void setEventPerformer(EventPerformer eventPerformer) {
		this.eventPerformer = eventPerformer;
	}


	public GraphicsBuilder getGraphicsBuilder() {
		return graphicsBuilder;
	}

	
	public void setGraphicsBuilder(GraphicsBuilder graphicsBuilder) {
		this.graphicsBuilder = graphicsBuilder;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}


	/**
	 * @return the gameFrame
	 */
	public GameFrame getGameFrame() {
		return gameFrame;
	}


	/**
	 * @param gameFrame the gameFrame to set
	 */
	public void setGameFrame(GameFrame gameFrame) {
		this.gameFrame = gameFrame;
	}
	
}
