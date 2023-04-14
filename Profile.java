import java.util.Scanner;

public class Profile {
  
    String firstName;
    String lastName;
    int gradYear;
    double GPA;
    String major;

    Profile(String lastName, String firstName, String major, int gradYear, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.gradYear = gradYear;
        this.GPA = GPA;
    }
  
    Profile() {}

    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setMajor(String major) {this.major = major;}
    public void setGPA(double GPA) {this.GPA = GPA;}
    public void setGradYear(int gradYear) {this.gradYear = gradYear;}

    /*
     getters
     public String getLastName() {return lastName;}
     public String getFirstName() {return firstName;}
     public String getMajor() {return major;}
     public double getGPA() {return GPA;}
     public int getGradYear() {return gradYear;}
    */


    public void display() {
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + GPA);
        System.out.println("Intended graduation year: " + gradYear);
    }
  
    public static void main(String[] args) {
      
     Profile student = new Profile();
     Scanner input = new Scanner(System.in);

    String firstName = input.next();
    String lastName = input.next();
    String major = input.next();
    int year = input.nextInt();
    double gpa = input.nextDouble();

     student.setFirstName(firstName);
     student.setLastName(lastName);
     student.setMajor(major);
     student.setGPA(gpa);
     student.setGradYear(year);

     student.display();

    }
}
