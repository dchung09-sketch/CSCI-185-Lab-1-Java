# CSCI 185 Lab 1 — Student Profile Application

**Author:** Daniel Chung  
**Course:** CSCI 185 – Programming II  
**Section:** M03  
**Lab:** 1 — Problems 3.1–3.5  
**Institution:** New York Institute of Technology  
**Language:** Java

## Overview

This lab models a student's personal and academic information using a reusable Student class. A separate Main class creates a Student object and displays its information, demonstrating foundational object-oriented programming concepts in Java.

The project separates the student data model from the application entry point and organizes the Student class within the StudentFiles package.

## Files

| File | Purpose |
|------|---------|
| `StudentFiles/Student.java` | Defines the Student class, its fields, constructors, access methods, and formatted output. |
| `Main.java` | Creates a Student object with predefined information and prints it. |

The uploaded driver file is named `Main (4).java`. Rename it to `Main.java` before compiling.

## Student Information

The Student class stores six private fields:

| Field | Type | Information |
|-------|------|-------------|
| `studentfirstname` | String | First name |
| `studentlastname` | String | Last name |
| `nyitmajor` | String | Academic major |
| `nyitstudentID` | String | Student identifier |
| `studentage` | int | Age |
| `enrollednyitClasses` | String | Enrolled courses |

## Features

### Constructors

The class provides two constructors:

- A default constructor that initializes a predefined student profile.
- A parameterized constructor that accepts custom profile information.

The parameterized constructor accepts values in this order:

```java
Student(
    String studentlastname,
    String studentfirstname,
    String nyitmajor,
    int studentage,
    String nyitstudentID,
    String enrollednyitClasses
)
```

### Getter Methods

The following methods retrieve stored information:

- `getStudentfirstname()`
- `getStudentlastname()`
- `getNyitmajor()`
- `getNyitstudentID()`
- `getEnrollednyitClasses()`

### Setter Methods

The following methods update selected fields:

- `requiredFirstName(String officialFirstName)`
- `requiredLastName(String officialLastName)`
- `requiredMajor(String officialMajor)`
- `requiredstudentcurrentclass(String officialClasses)`

### Formatted Object Output

The class overrides `toString()` to return a multiline description containing the student's enrolled courses, identifier, age, major, and full name.

Passing a Student object to `System.out.println()` automatically uses this method.

## Program Flow

1. Main imports `StudentFiles.Student`.
2. The program creates a Student object using the parameterized constructor.
3. The constructor assigns the supplied values to the object's private fields.
4. Main prints the object.
5. The overridden `toString()` method supplies the formatted profile.

The demonstration uses hardcoded data and does not request keyboard input.

## Concepts Practiced

- Classes and objects
- Private instance variables
- Encapsulation
- Default and parameterized constructors
- The `this` keyword
- Getter and setter methods
- Package declarations and imports
- Overriding `toString()`
- Separating a data model from the application entry point

## How to Run

### Requirements

Install a Java Development Kit (JDK) with `javac` and `java` available in your terminal. No external libraries are required.

### File Organization

Inside the lab folder:

1. Rename `Main (4).java` to `Main.java`.
2. Create a folder named `StudentFiles`.
3. Place `Student.java` inside `StudentFiles`.
4. Keep `Main.java` and `README.md` at the top level of the lab folder.

The folder name `StudentFiles` must match the package declaration in Student.java.

### Compile

Open a terminal in the lab folder and run:

```sh
javac Main.java StudentFiles/Student.java
```

### Run

```sh
java Main
```

The program displays the student profile defined in Main.java.

## Current Limitations

- Student information is hardcoded.
- Constructor and setter inputs are not validated.
- Age has no getter or setter.
- The student identifier has a getter but no setter.
- Enrolled courses are stored as one string rather than a collection.
- Several output labels refer specifically to Daniel and ECE, even when a different profile is supplied.
- The first output label needs a space before the enrolled-course text.

## Learning Objective

Practice designing an encapsulated Java class, initializing objects through constructors, accessing and updating selected fields through methods, and displaying object information through a custom string representation.
