// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5265.steamwiffle.subsystems;


import org.usfirst.frc5265.steamwiffle.RobotMap;
import org.usfirst.frc5265.steamwiffle.commands.*;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import edu.wpi.first.wpilibj.PowerDistributionPanel;
//import edu.wpi.first.wpilibj.AnalogAccelerometer;
//import edu.wpi.first.wpilibj.AnalogGyro;
//import org.usfirst.frc5265.steamwiffle.Robot;
//import edu.wpi.first.wpilibj.RobotDrive;
//import edu.wpi.first.wpilibj.Victor;



/**
 *
 */
public class chassis extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final static SpeedController speedController0 = RobotMap.chassisSpeedController0; // Front Left
    private final static SpeedController speedController1 = RobotMap.chassisSpeedController1; // Front Right
    private final static SpeedController speedController2 = RobotMap.chassisSpeedController2; // Rear Right
    private final static SpeedController speedController3 = RobotMap.chassisSpeedController3; // Rear Left
    public final static SpeedController brushless = RobotMap.brushless;
    //private final AnalogGyro analogGyro1 = RobotMap.chassisAnalogGyro1;
    // private final PowerDistributionPanel powerDistributionPanel1 = RobotMap.chassisPowerDistributionPanel1;
    //private final AnalogAccelerometer analogAccelerometer1 = RobotMap.chassisAnalogAccelerometer1;
  
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    //public int angleOrient = 0;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    // driving the individual wheels. If a certain motor begins to not supply sufficient umph, we can modify it here
    public static void driveFrontLeft(double speed) {
        speedController0.set(speed);
        //SmartDashboard.putNumber("FrontLeft", speed);
    }
    public static void driveFrontRight(double speed) {
        speedController1.set(speed);
       //SmartDashboard.putNumber("FrontRight", speed);
    }
    public static void driveRearRight(double speed) {
        speedController2.set(speed);
       //SmartDashboard.putNumber("RearLeft", speed);
    }
    public static void driveRearLeft(double speed) {
        speedController3.set(speed);
       //SmartDashboard.putNumber("RearRight", speed);
    }
    public static void brushless(double speed) {
        brushless.set(speed);
        
    }
    
    // main driving program, using simple addition to get the robot moving in the appropriate direction
   
    public static void driveChassisSteering(double x_speed, double y_speed) {
    	double FL, FR, RL, RR;
    //	double maxXYT;
    	
    	if(x_speed < -0.1 || x_speed > 0.1){

        	FL =  -x_speed;
        	FR =  x_speed;
        	RL = -x_speed;
        	RR = x_speed;
    		
    	}else{
    		FL = y_speed;
        	FR = y_speed;
        	RL = y_speed;
        	RR = y_speed; 	
    	}
    	
    	
    	
    	
    	/*
    	 // NORMALIZE max FL, FR, RR and RL to 1
    	 
    	maxXYT = Math.max(Math.abs(FL), Math.abs(FR));
    	maxXYT = Math.max(maxXYT, Math.abs(RL));
    	maxXYT = Math.max(maxXYT, Math.abs(RR));
    	if (maxXYT > 1) {
    		FR = FR / maxXYT;
    		FL = FL / maxXYT;
    		RR = RR / maxXYT;
    		RL = RL / maxXYT;
    	}
    	*/
    		
    	driveFrontLeft(FL);
    	driveFrontRight(FR);
    	driveRearLeft(RL);
    	driveRearRight(RR);
    	
    	// EVALUATION TEST
	//	SmartDashboard.putNumber("DB/Slider 0", FL);
	//	SmartDashboard.putNumber("DB/Slider 1", FR);
	//	SmartDashboard.putNumber("DB/Slider 2", RL);
	//	SmartDashboard.putNumber("DB/Slider 3", RR);
    	
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    	
    	// calls the command to get the joystick position for driving
    	setDefaultCommand(new driveCommandSteer());
    }
}

