// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5265.steamwiffle;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.NidecBrushless;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.SpeedController;
//import edu.wpi.first.wpilibj.AnalogAccelerometer;
//import edu.wpi.first.wpilibj.AnalogGyro;
//import edu.wpi.first.wpilibj.Compressor;
//import edu.wpi.first.wpilibj.Relay;
//import edu.wpi.first.wpilibj.RobotDrive;
//import edu.wpi.first.wpilibj.Solenoid;
//import edu.wpi.first.wpilibj.Talon;
//import edu.wpi.first.wpilibj.Ultrasonic;


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
//import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
	public static SpeedController chassisSpeedController0; // Front Left
    public static SpeedController chassisSpeedController1; // Front Right
    public static SpeedController chassisSpeedController2; // Rear Right
    public static SpeedController chassisSpeedController3; // Rear Left
    public static SpeedController shooterMotor; 
    public static SpeedController chubby;
    public static AnalogPotentiometer analPot;
    public static PowerDistributionPanel chassisPowerDistributionPanel1;
    public static SpeedController brushless;
//    public static DigitalInput fuelLimitSwitch1;
    public static Servo servme;
    public static DoubleSolenoid airDoubleSolenoid1; 
    public static DigitalInput upper;
    public static DigitalInput lower;
    public static NidecBrushless arm;
    	
   
    
    public static void init() {
        // declare our Victors, in a clockwise direction across the front and then the back,
    	// as if you were sitting in the center of the robot
    	// 0 intake 1
    	// x xxxxxx x
    	// x xxxxxx x
    	// 3 xgearx 2
    		chassisSpeedController0 = new Victor(0); // Front Left
        //LiveWindow.addActuator("chassis", "Speed Controller 0", (Victor) chassisSpeedController0);
        
        chassisSpeedController1 = new Victor(1); // Front Right
        //LiveWindow.addActuator("chassis", "Speed Controller 1", (Victor) chassisSpeedController1);
        
        chassisSpeedController2 = new Victor(2); // Rear Right
        //LiveWindow.addActuator("chassis", "Speed Controller 2", (Victor) chassisSpeedController2);
        
        chassisSpeedController3 = new Victor(3); // Rear Left
       // LiveWindow.addActuator("chassis", "Speed Controller 3", (Victor) chassisSpeedController3);
       
        brushless = new Victor(4);
        //LiveWindow.addActuator("brush", "brush motor", (Victor) brushless);
        
        chubby = new Victor(5);
        //LiveWindow.addSensor("chassis", "analpot", (AnalogPotentiometer) analPot);
        
        //servme = new Servo(9);
        //LiveWindow.addActuator("Servo", 9, (Servo) servme);
        
        	    arm = new NidecBrushless(8,8);
       
        	
        try {
            upper = new DigitalInput(1);
        }catch(Exception e) {
    		
        }try {
            lower = new DigitalInput(0);
        }catch(Exception e) {
    		
        }try { 
            analPot = new AnalogPotentiometer(3);
        }catch(Exception e) {
    		
        }try {
            airDoubleSolenoid1 = new DoubleSolenoid(0,1);
        }catch(Exception e) {
        		
        }

    }
}
