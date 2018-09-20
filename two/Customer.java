package com.company;

import java.util.Scanner;

public class Customer extends Claim{
    private int customerID;
    private String customerName;
    private String customerIssue;
    private boolean fileStatus;
    private int increment=1;

    Scanner scanner=new Scanner(System.in);

    @Override
    protected void fileClaim(Claim claim){
        customerID=increment;
        increment++;
        claim.customerInfo.setFlag(true);
        claim.customerInfo.setId(customerID);

//        System.out.println("claimAmount: ");
//        claim.claimAmount=scanner.nextInt();
//        fileStatus=true;
//        System.out.println("customerIssue: ");
//        customerIssue=scanner.next();
//        System.out.println("customerName: ");
//        customerName=scanner.next();
    }

}
