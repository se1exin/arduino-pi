package com.jacobhmorris.rcpi.model;

public final class Motor {
	private int speed;
	private Direction direction;
	
	public Motor(int speed, Direction direction) {
		this.speed = speed;
		this.direction = direction;
	}
	static enum Direction {
		BACKWARDS, FORWARDS
	}
	public int getSpeed() { return speed; }
	public Direction getDirection() { return direction; }
	public int getIntDirection() {
		if(direction == Direction.BACKWARDS) { 
			return 0; 
		}else {
			return 1; 
		}
	}
	public void setSpeed(int speed) { this.speed = speed; }
	public void setDirection(Direction direction) { this.direction = direction; }
}