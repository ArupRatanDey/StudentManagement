
package Package1;

public class Person {
    protected String Name;    
    protected Department dept =new Department();
    
    public Person(){}
    public Person(String Name, Department dept){
    this.Name=Name;
    this.dept=dept;
    }
    
    public void ShowInfo(){
    System.out.println("Name : "+Name);
    System.out.println("Department : "+dept.getName());
    
    }
}
