package com.enzoPractica.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@AllArgsConstructor
@Data
public class User {
    private String userId;
    private static int id = 000000;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private BigInteger loan;
    private List<BigInteger> loans;


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
        System.out.println("How much money you need: ");
        this.loan = in.nextBigInteger();
        this.loans = userLoans(loan);
        showInfo();
    }
    private String setStudentId(){
        id++;
        return "R"+id;
    }
    public String showInfo(){
       String info = firstName + " " + lastName  + " " + userId + " " + "Your debt is: "+loans.stream().collect(Collectors.toList());
        return info;
    }
    public List<BigInteger> userLoans(BigInteger loan){
        List<BigInteger> loanList = new ArrayList<>();
        loanList.add(loan);
        return loanList;
    }
}
