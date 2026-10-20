package StudentFiles;

import java.lang.reflect.Array;

public class Student {
    private String studentlastname;// This creates a private variable that stores the student's last name
    private String studentfirstname;// This creates a private variable that stores the student's first name
    private String nyitmajor;// This creates a private variable tthat stores the student's major
    private String nyitstudentID;// This creates a private variable that stores the students ID number
    private int studentage;// This creates a private variable that stores the students age
    private String enrollednyitClasses;// This creates a private variable that stores the students classe

    public Student() {
        this.studentfirstname = "Daniel";// This line adds the value "Daniel" as the first name
        this.studentlastname = "Chung";// This line adds the value "Chung" as the last name
        this.nyitmajor = "Electrical and Computer Engineering + Physics/ Mathematics Minor";// This line adds the value of being an ECE major as the official major
        this.studentage = 20;// This line adds the value of 20 as the students age
        this.nyitstudentID = "1331774";// This line adds the value of 1331774 as the student's ID number
        this.enrollednyitClasses = "Calculus, Physics, Computer Programming, Electrical Circuits 1 and Computer Organization";// This line adds the value of classes as the students official classe
    }

    public Student (String studentlastname, String studentfirstname, String nyitmajor, int studentage, String nyitstudentID, String enrollednyitClasses){//This defines a constructor with specific variable names with string arguments
                this.studentlastname = studentlastname;// This assigns the value of the parameter to the variable studentlastname
                this.enrollednyitClasses = enrollednyitClasses;// This assigns the value of the parameter to the variable enrollnyitClasses
                this.nyitstudentID = nyitstudentID;// This assigns the value of the parameter to the variable nyitstudentID
                this.studentage = studentage;// This assigns the value of the parameter to the variable studentage
                this.nyitmajor = nyitmajor;// This assigns the value of the parameter to the variable nyitmajor
                this.studentfirstname = studentfirstname;// This assigns the value of the parameter to the variable studentfirstname
    }
    public String getStudentfirstname(){// This line defined the getter getstudentfirstname
        return studentfirstname;// This line return's the instance variable studentfirstname
    }
    public String getStudentlastname(){// This line defined the getter getstudentlastname
        return studentlastname;// This line return's he instance variable studentlastname
    }
    public String getNyitmajor() {// This line defined the getter getnyitmajor
        return nyitmajor;// This line return's the instance variable studentlastname
    }
    public String getNyitstudentID(){// This line defined the getter getnyitstudentID
        return nyitstudentID;// This line return's the instance variable nyitstudentID
    }
    public String getEnrollednyitClasses(){// This line defined the getter getEnrollednyitClasses
        return enrollednyitClasses;// This line return's the instance variable nyitstudentID
    }

    public void requiredMajor(String officialMajor) {// This is a setter that assigns the  value of the parameter official major to the nyitmjor variable
        this.nyitmajor = officialMajor;// This variable is assigned to the current object
    }

    public void requiredLastName(String officialLastName) {// This a setter that assigns the value of the parameter officiallastname to the studentlastname variable
        this.studentlastname = officialLastName;// This variable is assigned to the current object
    }

    public void requiredFirstName(String officialFirstName) {// This is a setter that assigns the value of the parameter officialfirstname to the studentfirstname
        this.studentfirstname = officialFirstName;// This variable is assigned to the current object
    }

    public void requiredstudentcurrentclass(String officialClasses) {// This ia a setter that assigns the value of the parameter officialclasses to the variable requiredstudentcurrentclass
        this.enrollednyitClasses = officialClasses;//This variable is assigned to the current object
    }

    public String toString()// This statements takes string arguments through the toString statement to create an output
    { return// This line returns the final output
            "Daniel's Current Enrolled Classes as an ECE major at NYIT are" + enrollednyitClasses + "\n" +// All of these following lines creates the output of the following code:
                    "Daniel's official Student ID at NYIT is : " + nyitstudentID + "\n" +
        "Daniel's Official Age at the time being is : " + studentage + "\n" +
        "Daniel's Official major while attending NYIT is " +nyitmajor + "\n" +
       "The name that is registered in the NYIT Registrar is : " +studentfirstname+ " " + studentlastname + "\n";

    }



}
