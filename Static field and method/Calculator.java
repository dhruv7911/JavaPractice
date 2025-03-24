public class Calculator{
    public static double PIE = 3.14159265359;
    public static double Area(int radius){
	    return 2*(Calculator.PIE)*radius*radius;
    } 
    public static void main(String[] args){
	System.out.println("Pie: "+Calculator.PIE);	
	System.out.println("circle area(r: 12cm): "+Calculator.Area(12)+"cm\u00B2");
    }
}
