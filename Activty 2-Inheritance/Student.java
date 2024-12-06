public class Student extends Person{
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
    public String toString(){
        return "\nHello! I am " + Name + 
            ", I live in " + Address + 
                ". I am " + Year + " Year of " + 
                    Program + ".";
    }
}
