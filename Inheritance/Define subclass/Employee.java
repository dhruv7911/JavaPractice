import java.time.LocalDate;
public class Employee{//super class base class
    private String name;
    private String id;
    private int salary;
    private LocalDate hireDay;
    public Employee(String name,String id,int salary){
	this.name = name;
	this.id = id;
	this.salary = salary;
    }
    public setHireDate(){
	this.hireDay = LocalDate.now();
    }
    public static void main(String[] args){
		    
    }
}
class Manager Extends Employee{//subclass extends Employee class
	//added method and fields
	private double bonus;
	public void setBonus(double bonus){
	    this.bonus = bonus
	}
}

