import java.util.Objects;

public class Student extends Person {
    private double grade;

    public Student(int id, String name, int age, double grade) {
        super(id, name, age);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return Double.compare(grade, student.grade) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grade);
    }

    @Override
    public String toString() {
        int id = super.getId();
        String name = super.getName();
        int age = super.getAge();
        double grade = this.grade;
        return "Student --> id: %d name: %s, age: %d, grade: %s ".formatted(id, name, age, grade);
    }
}







