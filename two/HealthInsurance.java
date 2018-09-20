package com.company;

import java.util.Scanner;

public class HealthInsurance extends Claim{
    private int surveyorID;
    private String surveyorName;
    private String surveyorFeedback;
    private int increment=1;

    Scanner scanner=new Scanner(System.in);

    @Override
    protected void validateClaim(Claim claim){
        if(claim.customerInfo.getFlag()==true){
            surveyorID=increment;
            increment++;
            claim.surveyorInfo.setFlag(true);
            claim.surveyorInfo.setId(surveyorID);

//            System.out.println("Surveyor name:");
//            surveyorName=scanner.next();
//            System.out.println("Surveyor feedback:");
//            surveyorFeedback=scanner.next();
        }
    }
}
