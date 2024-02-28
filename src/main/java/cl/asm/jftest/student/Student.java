package cl.asm.jftest.student;
import java.util.logging.Logger; 
import java.util.Date;
public class Student {

    private static int count = 0; //static member: it belongs to the class and not to the object
    private String studentId;//instance member: it belongs to the object and not to the class

    static { //static block: it is called only once when the class is loaded
        Logger.getGlobal().info("Student class is loaded");
    }

    {//instance block: it is called every time an object is created
        Student.count++;
        Logger.getGlobal().info("Student count incrementado");
    }

    public Student(String id) {
        this.studentId = id;
        System.out.println(new Date() + " Student instance creada. Total student created = " + Student.count);
    }

    public String toString() {
        return "Student{studentId = "+this.studentId+"}";
    }

    
}
