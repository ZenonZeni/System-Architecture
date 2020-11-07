/*
 *  Template Developed by Sotirios Liaskos for the needs of
 *   ITEC3030 Systems Architecture.
 *  @ All Rights Reserved
 */
package itec3030.assignments.a1;

import itec3030.smarthome.standards.Furnace;
import itec3030.smarthome.standards.TemperatureSensor;
import itec3030.smarthome.standards.Thermostat;

import itec3030.assignments.a1.sensors.omnitemp.OmniTempSensorXS3;
import itec3030.assignments.a1.actuators.saharah.SaharaFurnaceHL42;
/**
 *
 * @author Sotirios
 */
public class Main {
    Main p = new Main();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller c = new Controller();

        //Create Building
        Building h = new Building();
        Room livingRoom = new Room();
        Room bedRoom = new Room();
        livingRoom.setName("Living Room");
        bedRoom.setName("Bedoom");

        TemperatureSensor o1 = new OmniTempSensorXS3(c,"o1");
        TemperatureSensor o2 = new OmniTempSensorXS3(c,"o2");
        TemperatureSensor o3 = new OmniTempSensorXS3(c,"o3");
        TemperatureSensor o4 = new OmniTempSensorXS3(c,"o4");

        Furnace f = new SaharaFurnaceHL42("f");
 
        livingRoom.install(o1);
        livingRoom.install(o2);
        bedRoom.install(o3);
        bedRoom.install(o4);

        h.add(livingRoom);
        h.add(bedRoom);
        h.setDesiredTemperature(20);
        h.setFurnace(f);

        c.setBuildingModel(h);
        
        o1.newTemperature(10);
        o2.newTemperature(12);
        o3.newTemperature(13);
        o4.newTemperature(18);
        
        o1.newTemperature(25);
        o2.newTemperature(23);
        o3.newTemperature(21);
        o4.newTemperature(22);
        
        
        // Part 3
        
        Thermostat th;
        th = new ThermoSetX19(c,"o5");
        h.setThermostat(th);
        
        //Un-comment for Part 3 ofthe assignment and add necessary creation code.
       
        th.newTemperature(30);
        h.setDesiredTemperature();
        
        o1.newTemperature(40);
        o2.newTemperature(50);
        o3.newTemperature(40);
        o4.newTemperature(100);
        
     
        
    }
}