package com.company;

public class Information {
    private boolean flag;
    private Integer id;
    public Information(boolean flag,Integer id){
        this.flag=flag;
        this.id=id;
    }
    public void setFlag(boolean flag){
        this.flag=flag;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public boolean getFlag(){
        return flag;
    }
    public Integer getId(){
        return id;
    }
}
