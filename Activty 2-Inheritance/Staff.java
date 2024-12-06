public class Staff extends Person{
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
    public String toString(){
        return "\nHello I am! " + Name + " and " + "I live in " + Address + ". ";
    }
}
