package edu.uhu.monopoly;

public class GoCell extends Cell {
	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	public boolean playAction(String msg) {
		return msg.isEmpty();
	}
	
	void setName(String name) {
	}
}
