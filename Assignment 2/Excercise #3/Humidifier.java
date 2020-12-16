/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itec3030a2;

import itec3030.smarthome.standards.ControllerInterface;

/**
 *
 * @author Christopher Nguyen
 */
public class Humidifier extends AddOnDecorator {
    protected ControllerInterface c;
    protected String ID;
    protected boolean enabled;
    protected int temperature;
    
    public Humidifier(OurFurnace o){
        f = o;
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
    
    public void turnOff(){
        this.disable();
        System.out.println("Humidifier: Off");
    }

    public void turnOn(){
        this.enabled();
        f.turnOn();
        System.out.println("Humidifier: On");
    }
    public boolean isOn(){
        return enabled;
    }
}
