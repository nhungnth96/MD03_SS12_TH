package TH2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nhung",27,"HN");
        Student student2 = new Student("Long",30,"HN");
        Student student3 = new Student("My",26,"HN");
        Student student4 = new Student("Minh",24,"HN");
        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(1,student1); // p1
        studentMap.put(2,student2); // p2
        studentMap.put(3,student3); // p3
        studentMap.put(4,student1); // p4 trùng value p1 -> != key -- put được
        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println("Map: "+student.toString());
        }
        Set<Student> students = new HashSet<>();
        students.add(student1); // a1
        students.add(student2); // a2
        students.add(student3); // a3
        students.add(student1); // a4 trùng value a1 -> a1 bị mất
        for (Student student : students) {
            System.out.println("Set: "+student.toString());
        }
    }
}