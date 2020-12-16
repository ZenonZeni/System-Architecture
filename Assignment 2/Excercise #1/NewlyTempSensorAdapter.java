/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itec3030a2;

/**
 *
 * @author Christopher Nguyen
 */

import itec3030.assignments.a1.sensors.newlytemp.NewlyTempSensorN.*;
import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.TemperatureSensor;
public class NewlyTempSensorAdapter implements TemperatureSensor, Observer{
    
    protected ControllerInterface c;
    protected String ID; 
    protected boolean enabled;
    protected int temperature;
    protected NewlyTemp nt;
    
    public NewlyTempSensorAdapter(){
        nt = new NewlyTemp();
        nt.registerObserver(this);
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
    //@overriding
    public int getReading(){
        return temperature;
    }
    
    //@overriding
    public void newTemperature(int i){
        nt.notifyObservers(i);
        nt.newTemperature();
    }
    
    public void update(int i) {
        System.out.println("New temperature is detected");
    }
    
}
