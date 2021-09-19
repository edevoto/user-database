package com.enzoPractica.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Scanner;

@AllArgsConstructor
@Data
public class User {
    private String userId;
    private static int id = 000000;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private List<String> loans;


    public User(){
        Scanner in = new Scanner(System.in);
        System.out.println("firstname: ");
        this.firstName = in.nextLine();
        System.out.println("lastname: ");
        this.lastName = in.nextLine();
        System.out.println("In wich is your job title:");
        this.jobTitle = in.nextLine();
        this.userId = setStudentId();
        System.out.println("Id: " + userId);
        showInfo();
    }
    private String setStudentId(){
        id++;
        return "R"+id;
    }
    public String showInfo(){
       return firstName + " " + lastName  + " " + userId;
    }
    public List<String> userLoans(String loan){

    }
}
