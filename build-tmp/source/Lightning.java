import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = 300;
int startY = 550;
int endX = 1;
int endY = 1;
public void setup()
{	
	strokeWeight(3);
	size(600,600);
	background(0,0,0);
	frameRate(30);
}
public void draw()
{
	stroke(255,255,0); 
	while(endY > 0)
	{
		endX = startX + (int)(Math.random()*30)-15;
		endY = startY - (int)(Math.random()*9);
		line(startX,startY,endX,endY);
		startX = endX;
		startY = endY;
	}
	fill(0,0,0,30);
	rect(-10,-10,615,615);
	noStroke();
	fill(150);
	ellipse(300,560,15,15);
	rect(298,560,4,40);
}
public void mousePressed()
{
	startX = 300;
	startY = 550;
	endX = 1;
	endY = 1;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
