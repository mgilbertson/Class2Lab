/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.model;

import java.util.Calendar;


/**
 *
 * @author Mitch
 */

public class WelcomeService {
    
    private Calendar currentDate = Calendar.getInstance();
    
    public String getTime() {
        int time = currentDate.get(Calendar.HOUR_OF_DAY);
        String message;
        if(time >=0 && time <12){
            message = "morning";
        }else if(time >=12 && time < 5){
            message = "afternoon";
        }else{
            message = "evening";
        }
        return message;
    }
    
    public String getWelcomeMessage(String name){
        return "Good " + getTime() + " " + name + "!";
    }
}