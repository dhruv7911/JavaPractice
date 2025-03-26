public class Employee{
    public static void main(String[] args){
	Manager m = new Manager();
	Employee[] emp_arr = new Employee[3];
	emp_arr[0]=m;
    }
}
class Manager extends Employee{
    
}
