public class ShapeCalculator{

    public  static double calculateArea(double length,double breath){
	return length*breath;
    }
    public static double calculateArea(double height,double base,double scaling){
	return 0.5*height*base;
    }
    public static double calculateArea(double side){
	return side*side;
    }
    public static void main(String[] args){

	System.out.println("Area of square(b:4cm): "+ShapeCalculator.calculateArea(4)+"cm\u00B2");
	System.out.println("Area of rectangle(l:2cm,b:1cm): "+ShapeCalculator.calculateArea(2,1)+"cm\u00B2");
    }
    
}
