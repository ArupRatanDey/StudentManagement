
package Package1;

public class Student extends Person{
    private String Id;
    private int Batch;
    private Semester addSem=new Semester();
    private final int lastSerial=2000;
    private static int count;
    
    public Student(String Name, Department dept, Semester sem,int Batch){
    this.Name=Name;
    this.dept=dept;    
    this.Batch=Batch;
    this.addSem=sem;
    count++;
    this.Id=generateID();
    
    }
    
    public String generateID(){
    int serial=lastSerial+count;
    return addSem.getCode()+"-"+dept.getCode()+"-"+serial;
        
    }

    
    @Override
    public void ShowInfo(){
    
    System.out.println("Id : "+Id);
    super.ShowInfo();
    System.out.println("Semester: "+addSem.getName());
    System.out.println("Batch : "+Batch);
    System.out.println();
    } 
}
