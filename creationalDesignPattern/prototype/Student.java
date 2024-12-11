package creationalDesignPattern.prototype;

class Student implements InnerPrototype {
    public String name;
    private Integer rollNo;
    public String division;

    public Student(String name, Integer rollNo, String division) {
        this.name = name;
        this.rollNo = rollNo;
        this.division = division;
    }

    @Override
    public Student clone() {
        Student student = new Student(this.name, this.rollNo, this.division);
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", division='" + division + '\'' +
                '}';
    }

}