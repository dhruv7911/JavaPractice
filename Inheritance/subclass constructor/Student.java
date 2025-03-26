class Person{
	private String name;
	public Person(String name){
	    this.name = name;
	}
}
public class Student extends Person{
	private String institution;
	public Student(String name,String institution){
	    super(name);
	    this.institution = institution; 
	}
	public static void main(String[] args){
	    Student d = new Student("d","xyz school");
	}
}

