package package2;
 
import Package1.Department;
import Package1.Semester;
import Package1.Student;


public class Main {

    public static void main(String[] args) {
        
        
    Department dept =new Department("SWE",35);
    Semester sem =new Semester("Spring 2020",201);
    
    Student Student1= new Student("Istiak Ahamed" ,dept,sem,31);
    Student Student2= new Student("Md Abuzar Gifari",dept,sem,31);
    Student Student3= new Student("Arup Ratan Dey",dept,sem,31);
    
    System.out.println("Students Information:");
    Student1.ShowInfo();
    Student2.ShowInfo();
    Student3.ShowInfo();
        
        
 
    
    
    }
    
}
