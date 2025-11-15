/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.tracker;

/**
 *
 * @author Kripa Shrestha
 */
public class TrackerManager {
    private WaterUseCalculator calculator = new WaterUseCalculator();
    
    public double calculateDailyUse(double shower, int laundry, double sink){
        calculator.setShowerMinutes(shower);
        calculator.setLaundryLoads(laundry);
        calculator.setSinkMinutes(sink);
        return calculator.calculateUse();
    }
    
}
