package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.dogfight.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer {
	
	private IOrderPerformer orderPerformer;


	EventPerformer(IOrderPerformer orderPerformer) {
		this.setOrderPerformer(orderPerformer);
	}
	
	private UserOrder keyCodeUserOrder(int KeyCode) {
		return null;
		
	}

	public IOrderPerformer getOrderPerformer() {
		return orderPerformer;
	}
	
	public void setOrderPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
	
	@Override
	public void eventPerform(KeyEvent keyCode) {
		// TODO Auto-generated method stub
		
	}
}
