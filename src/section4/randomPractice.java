package section4;

import java.util.Random;

public class randomPractice {
public static void main(String[] args) {
	

	Random randy=new Random();
int x=randy.nextInt(10);
int y=randy.nextInt(20);
int z=randy.nextInt(10)+1;
int a=randy.nextInt(51)+25;
System.out.println(a+" "+x+" "+y+" "+z);
}}
