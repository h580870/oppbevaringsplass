package no.hvl.dat100;

import easygraphics.*;

public class Grafikk extends EasyGraphics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			launch (args);
	}
	
	public void run() {
		makeWindow("Grafikk", 500, 150);
		drawCircle(180, 70, 60);
		drawCircle(300, 70, 60);
		//Sidelengs åttetall. y koordinatane til drawCircle sann eg ikkje ut av.
	}
}
