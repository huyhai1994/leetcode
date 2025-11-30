package java_sort;

public class Student implements Comparable<Student> {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }


    @Override
    public int compareTo(Student student) {
        int cmp = Double.compare(this.cgpa, student.cgpa);
        if (cmp != 0) {
            return cmp;
        }
        cmp = this.fname.compareTo(student.getFname());
        if (cmp != 0) {
            return cmp;
        }

        return Integer.compare(this.id, student.getId());
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}
