package org.comprable;

import java.util.Arrays;

public class Student implements Comparable<Student>{
    private String firstname;
    private String lastname;
    private int age;

    public Student(String firstname,String lastname, int age) {
        this.firstname = firstname;
        this.lastname=lastname;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
       // return this.age - other.age; //
        // Compare by firstname, then by lastname, then by age
        int firstNameComparison = this.firstname.compareTo(other.firstname);
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }
        int lastNameComparison = this.lastname.compareTo(other.lastname);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        return Integer.compare(this.age, other.age); // Compare by age
    }

   @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice","boy", 20);
        Student student2 = new Student("Bob","test", 22);
        Student student3 = new Student("Charlie", "test",19);
        Student student4 = new Student("Charlie", "boy",19);


        Student[] students = {student1, student2, student3,student4};

        // Sort the students array
      //  java.util.Arrays.sort(students);
       // Arrays.sort(students, (s1, s2) -> {
       //     return Integer.compare(s1.age, s2.age); // Compare by age
       // });

        // Print the sorted students
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
