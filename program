package gd;

import processing.core.*;

public class program extends PApplet{
	public int[] rgb = new int[3];
	public int posX = 50;
	public int posY = 200;
	public boolean isRect;
	
	public PApplet aplett = new PApplet();

	public figure leftFigure, rightFigure;

		public void setup(){
			size(700,400);
			rgb[0] = 255;
			rgb[1] = 255; 
			rgb[2] = 255;
			
			leftFigure = new figure(true,rgb[0],rgb[1],rgb[2],100,200, this);
			rightFigure = new figure(false,rgb[0],rgb[1],rgb[2],posX,posY, this);
		}
		
		
		
		public void draw(){
			background(50,50,50);							// new figure every time
			
			rightFigure.drawFigure(rgb[0], rgb[1], rgb[2], 400, 200);
			leftFigure.drawFigure(rgb[0], rgb[1], rgb[2], posX, posY);
			
			
		}
		
		public void keyPressed(){
		int i = 0;
			if (keyPressed){
				if (key == '1'){
					while(i<=2){
						leftFigure.rgb[i] = (int) random(255);
						i++;
					}
					i = 0;
				}
				
				if (key == '2'){
					while(i<=2){
						rightFigure.rgb[i] = (int) random(255);
						i++;
					}
					i = 0;
				}
				
				if (key == 'w'){
					posY = posY-4;
				}
				
				if (key == 'a'){
					posX = posX-4;
				}
				
				if (key == 's'){
					posY = posY+4;
				}
				
				if (key == 'd'){
					posX = posX+4;
				}
			}
		}
		
		public void mouseClicked(){
		int i = 0;	
			while (i<=2) {
			leftFigure.rgb[i] = (int) random(255);
			rightFigure.rgb[i] = (int) random(255);
			i++;
			}
		}

}
