package org.hashandtostring;

public class Student {

    private int id;

    public Student(int i, String name) {
        this.id=i;
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String  name;

    @Override
    public boolean equals(Object object){
        if (this == object){
            return true;
        }

        if (object==null){
            return false;
        }

        if (getClass() != object.getClass()){
            return false;
        }

        Student st = (Student) object;

        if (id!=st.id){
            return false;
        }

        if (name==null && st.name!=null){
            return false;
        }
        if (!name.equals(st.name)){
            return false;
        }

        return true;

    }

    @Override
    public String toString(){
        return "id: "+ this.id + ", name: "+ this.name;

    }

    public static void main(String[] args) {
        Student st1 = new Student(1,"name");
        Student st2 = new Student(1,"name");

        System.out.println(st1.toString());
        System.out.println(st1.equals(st2));
        System.out.println(st1==st2);

    }
}
