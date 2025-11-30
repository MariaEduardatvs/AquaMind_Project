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
        double showerUse = showerMinutes*16; //approx 16 litres per minute as per source: https://bayou-bathrooms.com/inspire/how-much-water-does-a-shower-use#:~:text=The%20average%20shower%20water%20usage%20is%20about%2016l,the%20amount%20of%20water%20as%20a%20standard%20one.
        double laundryUse = laundryLoads*65; //approx 50-80 litres per load so using 65 litres: https://www.puellascents.com/washing/how-many-litres-of-water-are-used-per-wash/#:~:text=Older%20washing%20machines%20%2815%2B%20years%29%20%E2%80%93%20100%20to,use%20as%20little%20as%2035%E2%80%9350%20litres%20per%20cycle.
        double sinkUse = sinkMinutes*6; //approx 4-8 litres per min so using 6 litres: https://interior-designy.com/how-much-water-is-used-per-minute-by-a-sink-faucet.html
        
        return showerUse+laundryUse +sinkUse;
    }
    
    //Resets all input values to zero
    public void reset(){
        showerMinutes = 0;
        laundryLoads = 0;
        sinkMinutes = 0;
    }
}
