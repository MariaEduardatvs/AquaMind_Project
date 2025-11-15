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
    private double showerMinutes;
    private int laundryLoads;
    private double sinkMinutes;
    
    public void setShowerMinutes(double showerMinutes){this.showerMinutes = showerMinutes;}
    public void setLaundryLoads(int laundryLoads){this.laundryLoads = laundryLoads;}
    public void setSinkMinutes(double sinkMinutes){this.sinkMinutes = sinkMinutes;}
    
    public double calculateUse(){
        return (showerMinutes * 9)+ (laundryLoads * 50) + (sinkMinutes * 6);
    }
}
