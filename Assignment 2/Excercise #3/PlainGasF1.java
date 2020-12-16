/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itec3030a2;

import itec3030.smarthome.standards.*;

/**
 *
 * @author Christopher Nguyen
 */
public class PlainGasF1 extends OurFurnace {
    protected ControllerInterface c;
    protected String ID;
    protected boolean enabled;
    protected int temperature;
    
    public PlainGasF1(){
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
        System.out.println("PlainGasF1: Off and Not Running");
    }

    public void turnOn(){
        this.enabled();
        System.out.println("PlainGasF1: Up and Running");
    }
    public boolean isOn(){
        return enabled;
    }
}
