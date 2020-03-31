package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		Robot rob=new Robot("batman");
		rob.penDown();
		rob.setPenWidth(10);
		rob.setSpeed(250);
		rob.setRandomPenColor();
		for(int i=0;i>-1;i++) {
		rob.move(250);
		rob.turn(70);
		rob.move(140);
		rob.turn(90);
		rob.move(360);
		rob.turn(1170);}
		// START HERE
	
		
		
	}
}
