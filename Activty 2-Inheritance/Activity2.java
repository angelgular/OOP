public class Activity2 {
    public static void main(String[] args) {
        Student student1 = new Student("Angel", "Brgy. Caloocan, Balayan", "BSIT", 3);
        
        System.out.println("\nSTUDENT");
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Address: " + student1.getAddress());
        System.out.println("Student Program: " + student1.getProgram());
        System.out.println("Student Year: " + student1.getYear());
        System.out.println(student1.toString());
        
        System.out.println("\n\nSTAFF");
        Staff staff1 = new Staff("Victoria", "Brgy. 8, Balayan", "BSU-Balayan", 500.50);
        System.out.println("Staff Name: " + staff1.getName());
        System.out.println("Staff Address: " + staff1.getAddress());
        System.out.println("Staff School: " + staff1.getSchool());
        System.out.println("Staff Salary: " + staff1.getSalary() + "php");
        System.out.println(staff1.toString());
    }
}
