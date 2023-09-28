package ca.yorku.themortageapp;

public class MortgageModel {

    //a mortage requires 3 attributes:
    int years;
    double principle;
    double interest;

    //create constructors:
    public MortgageModel(String p, String t, String i){

        this.principle = Double.parseDouble(p);

        this.interest = Double.parseDouble(i);

        this.years = Integer.parseInt(t);
    }


    /*This method computes the monthly payment for the Mortgage */
    public String computePayment(){

        String monthyPayment = "";

        int time = this.years*12;


        double rate = (this.interest/100)/12;

        double monthly = (rate*this.principle)/(1-Math.pow((1+rate), -time));

        monthyPayment =    String.format("$%,.2f", monthly);

        return monthyPayment;
    }




}
