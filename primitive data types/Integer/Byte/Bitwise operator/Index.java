public class Index{
    public static void main(String[] args){
	byte a,b,c;
	a = 0b00110101;
	b = 0b00001111;
	//Bitwise And operator
	byte byteAnd = (byte)(a&b);
	
	//Bitwise OR operator
	byte byteOr = (byte)(a|b);

	//Left shift
	byte leftShift = (byte)(a<<1);

	//right shift
	byte rightShift = (byte)(a>>1);

	System.out.println("Byte and: "+byteAnd);
	System.out.println("Byte or: "+byteOr);
	System.out.println("Left shift: "+leftShift);
	System.out.println("Right shift: "+rightShift);
    }
}
