package Generics_buoi14;
//Generics class
//Generics inteface
interface identifiable<ID>{
    ID getid();
}

public class Student <T,ID> implements identifiable <ID> {
    private String name;
    private T grade;
    private ID id;
    public Student(String name, T grade,ID id){
        this.name = name;
        this.grade = grade;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name:"+ name + "  Grade:" + grade + " ID:" + id;
    }
    @Override
    public ID getid(){
        return id;
    }

    public static void main(String[]args){
        Student <Integer,String> student = new Student<>("dat",5,"asdfghjkl");
        Student <String,Double> student1 = new Student<>("quynh","A++",8.987654);
        System.out.println(student1.toString());
        System.out.println(student.toString());
    }


}


