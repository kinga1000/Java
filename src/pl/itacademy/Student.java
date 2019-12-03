

package pl.itacademy;

import java.time.LocalDate;
class Tester {
    public static void main(String[] args) {
        Student Jan = new Student("Jan", "Kowalski", 01 - 01 - 1990, "science", 1);
    Jan.setGraduateYear(1);
    System.out.println(Jan.getGraduateYear());

    }
}
public class Student extends Person {
    private String Faculty;
    private int GraduateYear;



    public Student(String FirstName, String LastName, int BirthDate, String Faculty, int GraduateYear) {
        super(FirstName, LastName, BirthDate);
        this.Faculty = Faculty;
        this.GraduateYear = 1;
    }
            public void setGraduateYear(int year){
                GraduateYear=this.GraduateYear;}


            public int getGraduateYear(){
                return GraduateYear;
            }

        }

