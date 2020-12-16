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
import itec3030.assignments.a1.sensors.newlytemp.NewlyTempSensorN.Observer;
import itec3030.smarthome.standards.TemperatureSensor;
public class Main {
    public static void main(String[] args) {
        Controller c = new Controller();

        TemperatureSensor o1 = new OldyTempSensorAdapter();
        o1.setController(c);
        o1.setID("o1");
        
        TemperatureSensor o2 = new NewlyTempSensorAdapter();
        o2.setController(c);
        o2.setID("o2");
        // ***
        // SCENARIO 1
        // ***
        // The grader should be able to plug the JAR, fix the import and run the below.
        o1.newTemperature(0);
        o1.newTemperature(0);
        o1.newTemperature(0);
        
         // ***
        // SCENARIO 2
        // ***
        // The grader should be able to plug the JAR, fix the import and run the below.
        o2.newTemperature(0);
        o2.newTemperature(0);
        o2.newTemperature(0);
        
         // ***
        // SCENARIO 3
        // ***
        // The grader should be able to plug the JAR, fix the import and run the below.
        OurFurnace n = new PlainGasF1();
        n = new Humidifier(n);
        n = new WiFi(n);
        n.turnOn();
    }
}
