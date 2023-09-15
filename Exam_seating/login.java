package Exam_seating;

import java.util.Scanner;

public class login {
//for administrators' and students' login//
    public void inputs (String[] args) {
        //we create a user object
        student user = new student();
        
        System.out.println("Enter email: ");
        Scanner scan1 = new Scanner(System.in);
        
        user.email = scan1.nextLine();
        
        System.out.println("Enter password: ");
        Scanner scan2 = new Scanner(System.in);
        user.password = scan2.nextLine();
        
        //verify if the pswd corresponds to the email in the database
        
        scan1.close();
        scan2.close();
        
        System.out.println(user.getInfo());
    } 

}