package com.enzoPractica;

import com.enzoPractica.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDatabaseApp {

    public static void main(String[] args) {
        System.out.println("How many users going to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfUsers = in.nextInt();
        User[] users= new User[numOfUsers];
        for (int i = 0; i< numOfUsers; i++){
            users[i] = new User();
            System.out.println(users[i].showInfo());

        }
        for (int i = 0; i< numOfUsers; i++){
            System.out.println(users[i]);
        }

    }
}
