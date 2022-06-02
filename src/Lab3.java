
public class Lab3 {

	public static void main(String[] args) { // String args []
	
		
		float f, c; 	// declare public variables 
		
		f = (float) 98.6;	// assign variable value for f 
		
		c = (float)5/9*(f-32);		// conversion f to c
		
		
		System.out.println("fahrenheit = "+f+", centigrade = "+c); // equivalent to cout << endl;
		
		for(float i=0; i<=40; i+=5) {
			
			
			System.out.println("fahrenheit = "+i+", centigrade = "+((i-32)*5/9));
		
		}		// Second method with while loop
		
		System.out.println(" ");
		
		float j = (float) 0.0;
		
		while(j <= 40.0) {
			
			System.out.println("fahrenheit = "+j+", centigrade = "+((j-32)*5/9));
			
			j+=5;
			
		}
		
	}

}
