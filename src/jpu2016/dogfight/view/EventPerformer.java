package jpu2016.dogfight.view;

import com.sun.glass.events.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;

public class EventPerformer {
	
	private IOrderPerformer orderPerformer;

	public EventPerformer(IOrderPerformer orderPerformer) {

	}
	public void eventPerform(KeyEvent keyCode) {
		
	}
	private UserOrder keyCodeUserOrder(int KeyCode) {
		return null;
		
	}
	/**
	 * @return the orderPerformer
	 */
	public IOrderPerformer getOrderPerformer() {
		return orderPerformer;
	}
	/**
	 * @param orderPerformer the orderPerformer to set
	 */
	public void setOrderPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
}
