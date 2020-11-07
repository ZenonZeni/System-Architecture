/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itec3030.assignments.a1;
import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.Thermostat;
 /*
 * @author Christopher Nguyen
 */
public class ThermoSetX19 implements Thermostat {
    //instance variables
    
    protected ControllerInterface c;
    protected String ID;
    protected boolean enabled;
    protected int temperature;
    
    public ThermoSetX19(ControllerInterface ci,String id){
        c = ci;
        ID = id;
    }
    
    public ControllerInterface getController(){
        return c;
    }

    public void setController(ControllerInterface ci){
        c = ci;
    }

    public String getID(){
        return ID;
    }

    public void setID(String string){
        ID = string;
    }

    public void enable(){
        enabled = true;
    }

    public void disable(){
        enabled = false;
    }

    public boolean enabled(){
        return enabled;
    }
    
    public int getReading(){
        return temperature;
    }
    //@overriding
    public void newTemperature(int i){
        temperature = i; 
        
    }
    
}
