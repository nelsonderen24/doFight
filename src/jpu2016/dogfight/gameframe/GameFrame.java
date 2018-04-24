package jpu2016.dogfight.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener {
	
	
	private static final long serialVersionUID = -118523942411776538L;
	private IEventPerformer eventPerformer;

	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder GraphicsBuilder, Observable observable) {

	}

	

	public IEventPerformer getEventPerformer() {
		return eventPerformer;
	}

	public void setEventPerformer(IEventPerformer eventPerformer) {
		this.eventPerformer = eventPerformer;
	}



	@Override
	public void keyPressed(KeyEvent keyEvent) {
		
	}


	@Override
	public void keyReleased(KeyEvent keyEvent) {
		
	}


	@Override
	public void keyTyped(KeyEvent keyEvent) {
		
	}
}