package jpu2016.dogfight.gameframe;

import java.awt.event.KeyEvent;
import java.util.Observable;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -118523942411776538L;
	private IEventPerformer eventPerformer;

	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder GraphicsBuilder, Observable observable) {

	}

	public void keyPressed(KeyEvent keyEvent) {

	}

	public void keyReleased(KeyEvent keyEvent) {
	
	}

	public void keyTyped(KeyEvent keyEvent) {
	
	}

	public IEventPerformer getEventPerformer() {
		return eventPerformer;
	}

	public void setEventPerformer(IEventPerformer eventPerformer) {
		this.eventPerformer = eventPerformer;
	}
}