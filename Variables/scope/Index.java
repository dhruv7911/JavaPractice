// Demonstrate block scope
public class Index{
    public static void main(String[] args){
	int x;//known to all code within main
	x = 10;
	if(x==10){//start to this scope
	    int y = 20;//known only to this block 
	    System.out.println("x and y: "+x+" "+y);
	    x = y * 2;

	}
	y = 100;//error ! y not here
	// x still known here
	System.out.println("x is "+ x);
    }
}
