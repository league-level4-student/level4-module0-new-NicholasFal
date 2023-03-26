package _04_Snake;

public enum Location {
UP, DOWN, LEFT, RIGHT;
private int x;
private int y;
private boolean equals(int x, int y) {
	if(this.x == x && this.y == y) {
		return true;
	} else {
		return false;
	}
}
}
