package com.nt.collection;

public class Example {
	int x;
	int y;

	private void exampl() {
		System.out.println("Example.exampl()");

	}

	public Example(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		Example e =  (Example) obj;
		if(obj instanceof Example) {
			return this.x==e.x && this.y==e.y;
		}else {
			return false;
		}
		
	}
	
	
	@Override
	public String toString() {
		return "Example [x=" + x + ", y=" + y + "]";
	}
	

}
