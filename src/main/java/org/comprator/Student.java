package org.comprator;


public class Student {
    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    private String firstname;
    private String lastname;
    private int age;

    public String getLastname() {
        return lastname;
    }


    public Student(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname=lastname;
        this.age = age;
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
        java.util.Arrays.sort(students,new SortByAge());
       // Arrays.sort(students, (s1, s2) -> {
       //     return Integer.compare(s1.age, s2.age); // Compare by age
       // });

        // Print the sorted students
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
