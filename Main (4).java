/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 185 Programming 2
Section: M03
Lab #1 Problems 3.1-3.5
 */

import StudentFiles.Student;// This line is providing the variables that would attack the Student Package within the Java Class.

public class Main {// This line of code provided the Mian public class for this programming lab
    public static void main(String[] args) {// This line of code in java is utilized the execute the program coe in java
        Student DanielNyit = new Student(// This line of code executes the new Student object
                "Chung",// All of the green lines of code are all of the outputs for this lab
                "Daniel",
                "Electrical and Computer Engineering + Physics/ Mathematics Minor",
                20,
                "1331774",
                "Calculus, Physics, Computer Programming, Electrical Circuits 1 and Computer Organization"
        );

        System.out.println(DanielNyit);// This line of code executes and prints the information fro the variable DanielNyit

    }
}