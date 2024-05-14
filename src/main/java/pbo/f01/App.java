package pbo.f01;

/**
 * 
 * @author 12S22023 Chika Situmorang
 * @author 12S22004 Bethania Hasibuan
 * 
 */

import pbo.f01.model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pbo.f01.model.Dorm;
import pbo.f01.model.DormAssign;
 

public class App {

    public static void main(String[] _args) {
       Scanner inputScanner = new Scanner(System.in);
       List<Dorm> dorms = new ArrayList<>();
       List<Student> students = new ArrayList<>();
       List<DormAssign> dormAssigns = new ArrayList<>();

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
                Dorm newDorm = new Dorm(inputParts[1], inputParts[2], inputParts[3]);
                dorms.add(newDorm);
            }
        }


        else if (inputParts[0].equals("student-add")) {
            Student newStudent = new Student(inputParts[1], inputParts[2], inputParts[3], inputParts[4]);
            if (!students.contains(newStudent)) {
                students.add(newStudent);
            }

           }
         
           else if (inputParts[0].equals("assign")) {
            DormAssign newDormAssign = new DormAssign(inputParts[1], inputParts[2]);
            if (!dormAssigns.contains(newDormAssign)) {
                dormAssigns.add(newDormAssign);
            }
           

        }
    }

    for (Student student : students) {
        System.out.println(student.toString());
    }
      
    for (Dorm dorm : dorms) {
        System.out.println(dorm.toString());
    }



    inputScanner.close();

}}