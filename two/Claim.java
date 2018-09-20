package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class Claim {

    private int claimId;
    private int increment=1;
    protected double claimAmount;
    protected Information customerInfo=new Information(false,null);
    protected Information surveyorInfo=new Information(false,null);
    protected Information managerInfo=new Information(false,null);

    public int getClaimId() {
        return increment++;
    }

    protected void fileClaim(Claim claim){    }
    protected void validateClaim(Claim claim){     }
    protected void decideClaim(Claim claim){  }

}
