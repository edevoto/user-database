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
    private String seniority;
    private String job;
    private List<String> courses;
    private int tuitionBalance;
    public int costOfCourse = 600;


    public User(){
        Scanner in = new Scanner(System.in);
        System.out.println("firstname: ");
        this.firstName = in.nextLine();
        System.out.println("lastname: ");
        this.lastName = in.nextLine();
        System.out.println("In wich seniority you are:");
        this.seniority = in.nextLine();
        this.userId = setStudentId();
        System.out.println("Id: " + userId);
        showInfo();
    }
    private String setStudentId(){
        id++;
        return "R"+id+seniority;
    }
    public String showInfo(){
       return firstName + " " + lastName + " "+seniority + " " + userId;
    }
    public List<String> enroll(String course){

    }
}
