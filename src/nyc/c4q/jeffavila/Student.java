package nyc.c4q.jeffavila;

import java.util.Scanner;

public class Student {


    private String firstName;
    private String lastName;
    private int idNumber;
    private String favFood;

    public Student(String firstName, String lastName, int idNumber, String favFood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.favFood = favFood;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }
    public static boolean checkSameFavoriteFood(Student studentOne, Student studentTwo) {
        return studentOne.getFavFood().equalsIgnoreCase(studentTwo.getFavFood());
    }
}
