package extra;

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

private static void house(String color, String size, int X, int Y) {
	Robot r= new Robot();
	int height=0;
	r.setX(X);
	r.setY(Y);
	r.setSpeed(100);

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
	/*if(size.equals("large")) {
		Flatroof(height, X, Y);
	}
	else if(size.equals("medium")) {
		Pointyroof();
	}
	else if(size.equals("small")) {
		Pointyroof();
	}
	*/
	
	r.move(height);
    r.turn(-90);
    r.setPenColor(0,200,0);
    r.setPenWidth(50);
    r.move(70);
    r.hide();
}
	private static void Pointyroof() {
		Robot r= new Robot();
		r.penDown();
		r.setSpeed(100);
	r.turn(45);
	r.move(70);
	r.turn(90);
	r.move(70);
	r.turn(45);;
	}
	
	private static void Flatroof(int height, int X, int Y) {
		
		Robot r= new Robot();
		r.penDown();
		r.setSpeed(100);
		r.setX(X+height);
		r.setY(Y+height);
		r.turn(90);
		r.move(70);
		r.turn(90);;
	
}
}