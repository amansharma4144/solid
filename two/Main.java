package com.company;

public class Main {

    public static void main(String[] args) {
        Claim claim=new Claim();

        Customer customer=new Customer();
        customer.fileClaim(claim);
        System.out.println(claim.customerInfo.getFlag());
        System.out.println(claim.customerInfo.getId());

        HealthInsurance healthInsurance=new HealthInsurance();
        healthInsurance.validateClaim(claim);
        System.out.println(claim.surveyorInfo.getFlag());
        System.out.println(claim.surveyorInfo.getId());

        Manager manager=new Manager();
        manager.decideClaim(claim);
        System.out.println(claim.managerInfo.getFlag());
        System.out.println(claim.managerInfo.getId());
    }
}
