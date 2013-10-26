package gd;

import processing.core.*;


public class figure extends program { 			// blueprint
public PApplet aplett = new PApplet();
	figure(boolean _isRect,int _r,int _g,int _b,int _posX,int _posY, PApplet p){   // Constructor
		this.aplett = p;
		this.rgb[0] = _r;
		this.rgb[1] = _g;
		this.rgb[2] = _b;
		this.isRect = _isRect;
		this.posX = _posX;
		this.posY = _posY;
	}
	
	public void drawFigure(int _r,int _g,int _b,int _posX,int _posY){

		if (isRect == true){
			this.posX = _posX;
			this.posY = _posY;
			aplett.fill(rgb[0],rgb[1],rgb[2]);
			aplett.rect(posX,posY,100,100);
			aplett.fill(255);
			aplett.ellipse(posX+50,posY,50,50);
		}
		
		else {
			aplett.fill(rgb[0],rgb[1],rgb[2]);
			aplett.triangle(400,200,450,300,350,300);
			aplett.fill(255);
			aplett.ellipse(400,200,50,50);
		}
	}
	
}
