/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aquamind;

import com.mycompany.aquamind.EducationalAndQuiz.Articles;
import com.mycompany.aquamind.EducationalAndQuiz.Facts;

/**
 *
 * @author Team Yellow
 */
public class AquaMindApp {

    public static void main(String[] args) {
          
    }

    Articles article1 = new Articles(
            "Unsafe water, sanitation and hygiene: a persistent health burden", """
             World Health Organization, 2023 highlights the global challenges related to access to safe water and sanitation.
             According to the study, around 2.2 billion people lack safely managed drinking water, and 3.5 billion people lack safely managed sanitation services. These conditions contribute significantly to diseases such as diarrhea, respiratory infections, and neglected tropical diseases. The authors emphasize that progress towards universal access to safe water and sanitation is too slow to meet the 2030 Sustainable Development Goals, stressing the urgent need for investment and policy action to protect public health.
              """,
            "UN Environment", 
            "Bruce Gordon"
    );
    
    Articles articles2=new Articles(
    "Water Supply, Sanitation, and Hygiene", """
     Published in Injury Prevention and Environmental Health (World Bank, 2017), provides
     a comprehensive overview of global access to water, sanitation, and hygiene (WASH)
     services. It discusses how improved WASH systems are essential for reducing disease,
     enhancing quality of life, and promoting sustainable development. The authors explain 
     the differences between basic and safely managed services, presenting data that show
     persistent inequalities between urban and rural areas. The chapter also highlights the
     economic and social benefits of investing in WASH, emphasizing that universal access is 
     vital for achieving health and development goals worldwide.""",
            "UN Environment", "Guy Hutton and Claire Chase"
    );
    
    Facts fact1=new Facts(
            "Where is Earth’s Water", "Only 2.5% of the Earth’s water is freshwater, and less than 1% is accessible in lakes and rivers.", "USGS", "unknown"
    );
    
    Facts fact2 = new Facts(
    "Water for Sustainable Food and Agriculture", "Agriculture uses about 70% of global freshwater, making water-saving techniques like drip irrigation essential.",
     "FAO", "unknown"
    );
    
    Facts fact3 = new Facts(
       ""     
            
    
    );
    
    
    
    
    

}


