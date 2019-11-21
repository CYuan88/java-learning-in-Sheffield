import sheffield.*;

public class Lissajou{
	public static void main(String args[]){
		EasyGraphics figure = new EasyGraphics(800,800,400,400);
		figure.moveTo(0,0);
		for(int i = 0; i< 100; i++){
			
			
			figure.lineTo(i,250*Math.sin(10*i));
			
			
			
		}
		final double PI = 3.1415;
		figure.moveTo(0,0);
		for(int i = 0; i< 100; i++){

			figure.lineTo(i,100*Math.sin(5*i + PI/6));
			
			
			
		}
		
		
		
		
	}
	
	
	
	
}