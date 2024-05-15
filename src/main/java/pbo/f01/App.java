package pbo.f01;

/**
 * 
 * @author 12S22023 Chika Situmorang
 * @author 12S22004 Bethania Hasibuan
 * 
 */

 import pbo.f01.model.Student;
 import pbo.f01.model.Dorm;
 import pbo.f01.model.DormAssign;
 
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Scanner;
 import java.util.Map;
 import java.util.Collections;
 
 public class App {
 
     public static void main(String[] _args) {
         Scanner inputScanner = new Scanner(System.in);
         List<Dorm> dorms = new ArrayList<>();
         List<Student> students = new ArrayList<>();
         Map<String, List<Student>> dormAssignments = new HashMap<>();
 
         while (inputScanner.hasNext()) {
             String input = inputScanner.nextLine();
             if (input.equals("---")) {
                 break;
             }
             String[] inputParts = input.split("#");
 
             if (inputParts[0].equals("dorm-add")) {
                 boolean dormExists = false;
                 for (Dorm existingDorm : dorms) {
                     if (existingDorm.getName().equals(inputParts[1])) {
                         dormExists = true;
                         break;
                     }
                 }
                 if (!dormExists) {
                     Dorm newDorm = new Dorm(inputParts[1], Integer.parseInt(inputParts[2]), inputParts[3]);
                     dorms.add(newDorm);
                     dormAssignments.put(inputParts[1], new ArrayList<>());
                 }
             } else if (inputParts[0].equals("student-add")) {
                 Student newStudent = new Student(inputParts[1], inputParts[2], inputParts[3], inputParts[4]);
                 if (!students.contains(newStudent)) {
                     students.add(newStudent);
                 }
             } else if (inputParts[0].equals("assign")) {
                 String studentId = inputParts[1];
                 String dormName = inputParts[2];
                 Student student = findStudentById(students, studentId);
                 Dorm dorm = findDormByName(dorms, dormName);
 
                 if (student != null && dorm != null && dorm.getGender().equals(student.getGender())) {
                     List<Student> assignedStudents = dormAssignments.get(dormName);
                     if (assignedStudents.size() < dorm.getCapacity()) {
                         assignedStudents.add(student);
                     }
                 }
             } else if (inputParts[0].equals("display-all")) {
                 displayAll(dorms, dormAssignments);
             }
         }
 
         inputScanner.close();
     }
 
     private static Student findStudentById(List<Student> students, String id) {
         for (Student student : students) {
             if (student.getId().equals(id)) {
                 return student;
             }
         }
         return null;
     }
 
     private static Dorm findDormByName(List<Dorm> dorms, String name) {
         for (Dorm dorm : dorms) {
             if (dorm.getName().equals(name)) {
                 return dorm;
             }
         }
         return null;
     }
 
     private static void displayAll(List<Dorm> dorms, Map<String, List<Student>> dormAssignments) {
         Collections.sort(dorms, (d1, d2) -> d1.getName().compareTo(d2.getName()));
         for (Dorm dorm : dorms) {
             System.out.printf("%s|%s|%d|%d%n", dorm.getName(), dorm.getGender(), dorm.getCapacity(), dormAssignments.get(dorm.getName()).size());
             List<Student> assignedStudents = dormAssignments.get(dorm.getName());
             Collections.sort(assignedStudents, (s1, s2) -> s1.getName().compareTo(s2.getName()));
             for (Student student : assignedStudents) {
                 System.out.printf("%s|%s|%s%n", student.getId(), student.getName(), student.getEntranceYear());
             }
         }
     }
 }
  