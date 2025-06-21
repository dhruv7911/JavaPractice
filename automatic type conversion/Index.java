//demonstrate automatic type conversion

public class Index{
    public static void main(String[] args){
	byte b = 10;
	short s = b; //Automatic casting from byte to short
	int i = b; //Automatic casting from byte to int
	long l = b; //Automatic casting from byte to long
	float f = b; //Automatic casting from byte to float
	double d = b; //Automatic casting from byte to double
	System.out.println(s);
	System.out.println(i);
	System.out.println(l);
	System.out.println(f);
	System.out.println(d);
    }
}
