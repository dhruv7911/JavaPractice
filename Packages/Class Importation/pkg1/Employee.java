package pkg1;
public class Employee{
    private String name;
    private String department;
    private String id;
    
    public Employee(String name,String department,String id){
	this.name = name;
	this.department = department;
	this.id = id;
    }
    public void getInfo(){
	System.out.println("Employee name: "+this.name+",Department: "+this.department+",id: "+this.id);

    }

}
