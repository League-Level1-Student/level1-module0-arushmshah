

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	
public static void main(String[] args) {
	house("black","large", 50, 550);
	house("white", "medium", 225, 550);
	house("gray", "small", 400, 550);
	house("black", "large", 575, 550);
	house("white", "medium", 750, 550);
}
static Robot r= new Robot();
private static void house(String color, String size, int X, int Y) {
	
	int height=0;
	r.setX(X);
	r.setY(Y);
	r.setSpeed(100);
	r.setPenWidth(3);
	r.setWindowColor(23, 30, 40);

	if(color.equals("gray")) {
		r.setPenColor(Color.LIGHT_GRAY);
	}
	if(color.equals("white")) {
		r.setPenColor(Color.WHITE);
	}
	if(color.equals("black")) {
		r.setPenColor(Color.BLACK);
	}
	r.penDown();
	if(size.equals("small")) {
		height=60;
	}
	if(size.equals("medium")) {
		height=120;
	}
	if(size.equals("large")) {
		height=250;
	}
	r.move(height);
	if(size.equals("large")) {
		FlatRoof();
	}
	else {
	PointedRoof();
	}
    r.move(height);
    r.turn(-90);
    r.setPenColor(22, 194, 85);
    r.setPenWidth(10);
    r.move(90);
    r.turn(-90);
    r.hide();   
}
private static void PointedRoof() {
	r.turn(45);
	r.move(50);
	r.turn(90);
	r.move(50);
	r.turn(45);
}
private static void FlatRoof() {
	r.turn(90);
	r.move(100);
	r.turn(90);
}
}