public class Index{
    public static void main(String[] args){
	byte b = 4;
	char c = 'c';
	short s = 1000;
	int i = 50000;
	float f = 5.6f;
	double d = 0.1234;
	double result = (f*b)+(i/c)-(d*s);
	System.out.println((f*b)+"type:"+((f*b).getClass().getName())+"+"+(i/c)+"-"+(d*s));
	System.out.println("result"+result);
    }
}
