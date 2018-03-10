public class AreaCalculator {
    
    public static void main(String[] args) {
    
    	computeArea(1,3);
    	System.out.println ();
    	
    	computeArea(10,15);
    	System.out.println ();
    	
    	computeArea (10,15);
    	System.out.println ();
    	
    }
    
    private static void computeArea(int startRadius,int endRadius){
    	for (int i = startRadius; i<endRadius; i++){
    		double area = circleArea(i);
    		System.out.println("Area of circle with radius "+ i + " is "+area);
    	}
    }
    
    public static double circleArea(int radius){
    	return (3.14 * radius * radius);
    }
}
