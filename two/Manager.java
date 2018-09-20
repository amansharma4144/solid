package com.company;

import java.util.Scanner;

public class Manager extends Claim{
    private int managerID;
    private String managerName;
    private String managerIssue;
    private int increment=1;

    Scanner scanner=new Scanner(System.in);

    @Override
    protected void decideClaim(Claim claim){
        if(claim.customerInfo.getFlag()==true && claim.surveyorInfo.getFlag()==true){
            managerID=increment;
            increment++;
            claim.managerInfo.setFlag(true);
            claim.managerInfo.setId(managerID);

//            System.out.println("Manager name:");
//            managerName=scanner.next();
//            System.out.println("Manager issue:");
//            managerIssue=scanner.next();
        }
    }
}
