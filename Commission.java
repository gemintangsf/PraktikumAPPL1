/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gemintang Sangkaji Furqon
 */
public class Commission extends Hourly {
    public double totalSales;
    public double commissionRate;
    
     public Commission(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate, double comRate) {
                super(eName, eAddress, ePhone, socSecNumber, rate);
                commissionRate = comRate;
            }
     public void addSales(double totSales){
         totalSales = totSales + totalSales;
     }
     public double pay() {
        double payment = super.pay() + (commissionRate*totalSales);
        totalSales = 0;
        return payment;
    }
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales : " + totalSales;
        return result;
    }
}
