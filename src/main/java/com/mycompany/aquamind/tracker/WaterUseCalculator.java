/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.tracker;

/**
 *
 * @author Kripa Shrestha
 */
public class WaterUseCalculator {
    //Data members
    private double showerMinutes;
    private int laundryLoads;
    private double sinkMinutes;
    
    //Setters
    public void setShowerMinutes(double showerMinutes){
        this.showerMinutes = showerMinutes;
    }
    public void setLaundryLoads(int laundryLoads){
        this.laundryLoads = laundryLoads;
    }
    public void setSinkMinutes(double sinkMinutes){
        this.sinkMinutes = sinkMinutes;
    }
    
    //Calculates the approx amount of water used
    public double calculateUse(){
        double showerUse = showerMinutes*9; //9 litres per minute
        double laundryUse = laundryLoads*70; //70 litres per minute
        double sinkUse = sinkMinutes*6; //6 litres per minute
        
        return showerUse+laundryUse +sinkUse;
    }
    
    //Resets all input values to zero
    public void reset(){
        showerMinutes = 0;
        laundryLoads = 0;
        sinkMinutes = 0;
    }
}
