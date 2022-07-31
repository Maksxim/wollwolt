package by.tms.collections.work4;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Student Ivan = new Student("Ivan","Ivanow",16,8.2);
        Student Oleg = new Student("Oleg","Loginov",15,7.4);
        Student Tana = new Student("Tana","Prostakova",16,9.3);
        Student Sweta = new Student("Sweta","Mikituk",15,7.1);
        Student Kiril = new Student("kiril","Liskovih",16,8.4);
        Student Ira = new Student("Ira","Polikarpuk",16,9.0);
        Student Wadim = new Student("Wadim","Boiko",15,7.6);
        Student Ira2 = new Student("Ira","Polikarpuk",16,8.0);
        Student Ira3 = new Student("Ira","Polikarpuk",15,7.4);

        List<Student> students = Arrays.asList(Ivan, Ira3, Oleg, Tana, Sweta, Kiril, Ira, Wadim, Ira2);
        Collections.sort(students);
        Iterator<Student> studentIterator = students.iterator();
        double maxScore = 0;
        String studentMaxScore = "";
        while(studentIterator.hasNext()){
            Student student = studentIterator.next();

            if(student.getAverageScoreForTheYear() > maxScore){
                maxScore = student.getAverageScoreForTheYear();
                studentMaxScore = student.getName() + " " + student.getSurname();
            }

        }
        System.out.println(studentMaxScore + " " + maxScore);
        System.out.println(students);
    }
}
