package by.tms.collections.work4;

public class Student implements Comparable<Student>{

    private String name;
    private String surname;
    private int age;
    private double averageScoreForTheYear;

    public Student(String name, String surname, int age, double averageScoreForTheYear) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageScoreForTheYear = averageScoreForTheYear;

    }

    @Override
    public int compareTo(Student o) {
        int nameSurnameCompare = (this.getName()+this.getSurname()).compareTo(o.getName() + o.getSurname());
        if(nameSurnameCompare == 0) {
            if (o.getAge() == this.getAge()) {
                 if(o.getAverageScoreForTheYear() == this.getAverageScoreForTheYear()){
                    return 0;
                } else if (o.getAverageScoreForTheYear() > this.getAverageScoreForTheYear()) {
                    return 1;
                }else return -1;
            } else if (o.getAge() > this.getAge()) {
                return 1;
            } else {
                return -1;
            }
        }
        else return nameSurnameCompare;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getAverageScoreForTheYear() {
        return averageScoreForTheYear;
    }

    @Override
    public String toString() {
        return "\n" + "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", averageScoreForTheYear=" + averageScoreForTheYear +
                '}';
    }
}