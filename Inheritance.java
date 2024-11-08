package inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Student student1 = new Student("Angel", "Brgy. Caloocan, Balayan", "BSIT", 3);
        
        System.out.println("\nSTUDENT");
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Address: " + student1.getAddress());
        System.out.println("Student Program: " + student1.getProgram());
        System.out.println("Student Year: " + student1.getYear());
        
        System.out.println("\n\nSTAFF");
        Staff staff1 = new Staff("Victoria", "Brgy. 8, Balayan", "BSU-Balayan", 500.50);
        System.out.println("Staff Name: " + staff1.getName());
        System.out.println("Staff Address: " + staff1.getAddress());
        System.out.println("Staff School: " + staff1.getSchool());
        System.out.println("Staff Salary: " + staff1.getSalary() + "php");
    }
    
}

class Person {
    protected String Name;
    protected String Address;
    
    //Setters
    public void setName(String name){
        this.Name = name;
    }
    public void setAddress(String address){
        this.Address = address;
    }
    
    //Getters
    public String getName(){
        return Name;
    }
    public String getAddress(){
        return Address;
    }
}

class Student extends Person{
    private String Program;
    private int Year;
    
    public Student(String Name, String Address, String Program, int Year){
        this.Name = Name;
        this.Address = Address;
        this.Program = Program;
        this.Year = Year;
    }
    
    //Setters
    public void setProgram(String Program){
        this.Program = Program;
    }
    public void setYear(int Year){
        this.Year = Year;
    }
    
    //Getters
    public String getProgram(){
        return Program;
    }
    public int getYear(){
        return Year;
    }
}

class Staff extends Person{
    private String School;
    private Double Salary;
    
    public Staff(String Name, String Address, String School, Double Salary){
        this.Name = Name;
        this.Address = Address;
        this.School = School;
        this.Salary = Salary;
    }
    
    //Setters
    public void setSchool(String School){
        this.School = School;
    }
    public void setSalary(Double Salary){
        this.Salary = Salary;
    }
    
    //Getters
    public String getSchool(){
        return School;
    }
    public Double getSalary(){
        return Salary;
    }
}
