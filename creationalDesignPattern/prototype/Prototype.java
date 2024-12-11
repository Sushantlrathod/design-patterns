package creationalDesignPattern.prototype;

/**
 * 1. the main idea is to make a copy or clone of the object.
 * 2. clonig is responsibility of the orignal object.
 */

public class Prototype {
    public static void main(String[] args) {
        Student student1 = new Student("Ram", 1, "4th");
        System.out.println(student1.toString());
        Student clonedStudent = student1.clone();
        System.out.println(clonedStudent.toString());
    }
}
