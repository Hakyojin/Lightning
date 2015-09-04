int startX = 300;
int startY = 550;
int endX = 1;
int endY = 1;
void setup()
{	
	strokeWeight(3);
	size(600,600);
	background(0,0,0);
	frameRate(30);
}
void draw()
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
void mousePressed()
{
	startX = 300;
	startY = 550;
	endX = 1;
	endY = 1;
}