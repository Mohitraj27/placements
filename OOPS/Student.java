package OOPS;



public class Student {
    // Creating some common fields
    private String name;
    private String college;
     
    public Student(String name,String college){
        // super keyword is used to refer parent class object also it used to distuiguish between subclass and superclass
         super();
         this.name=name;
         this.college=college;


    }

    public String getName(){
     return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getCollege(){
        return college;
    }
    public void setCollege(String college){
        this.college=college;
    }
    public static void main(String args[]){
        Student student1=new Student("Mohit Raj", "BIT Deoghar");
        Student student2=new Student("Roshan Pandey", "BIT Mesra");
        Student student3=new Student("Abhijeet ViswaKarma ", "BIT Patna");

        
    }
    
}
