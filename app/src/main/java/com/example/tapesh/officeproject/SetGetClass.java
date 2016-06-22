package com.example.tapesh.officeproject;

/**
 * Created by TAPESH on 5/23/2016.
 */
public class SetGetClass {
    String ephonenumber,eBillNo,eBillAmount;

    public String getEphonenumber() {
        return ephonenumber;
    }

    public void setEphonenumber(String ephonenumber) {
        this.ephonenumber = ephonenumber;
    }

    public String geteBillNo() {
        return eBillNo;
    }

    public void seteBillNo(String eBillNo) {
        this.eBillNo = eBillNo;
    }

    public String geteBillAmount() {
        return eBillAmount;
    }

    public void seteBillAmount(String eBillAmount) {
        this.eBillAmount = eBillAmount;
    }

    public SetGetClass(String ephonenumber, String eBillNo, String eBillAmount) {
        this.ephonenumber = ephonenumber;
        this.eBillNo = eBillNo;
        this.eBillAmount = eBillAmount;
    }

   public SetGetClass()
   {

   }

}
