package org.usfirst.frc5265.steamwiffle.commands;

import org.usfirst.frc5265.steamwiffle.Robot;
import org.usfirst.frc5265.steamwiffle.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;



/**
 * This is the default command for the subsystem 'chassis' and allows driving properly from the joystick
 */
public class driveCommandSteer extends Command {
 
	
    public driveCommandSteer() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {

    	
   // 	double f = 1.0;
   // 	double voltage = DriverStation.getInstance().getBatteryVoltage();
    	// variables for the raw data from the joystick
    	double x, y, minMotion,throttle;
    	
    	// load the variables from the joystick
    	x = Robot.oi.getForward();
    	y = Robot.oi.getSideways();
    //	thot = stagValues.what;
    	
    	//if(thot == 0) stagValues.what = 1.0;
    //	SmartDashboard.putNumber("tog", stagValues.what);

    	
    //SmartDashboard.putNumber("forward", x);
    	//SmartDashboard.putNumber("sideways", y);

    	//t = 0.0;
    	//commented out by jh 2/10 
    throttle = Robot.oi.getThrottle();
    	//throttle = 1;
    	//	minMotion = SmartDashboard.getNumber("minimumMotionJoystick", 0.0);
    	minMotion = stagValues.minimumMotionJoystick;
    	//double pwr = 2.0;
    	
    	// if we want to modify these variables, wgge modify them here
    	
    /*	//the tester
    	if(voltage < 7.5){
    		f = .75;
    		SmartDashboard.putNumber("f", f);
    	}
    	else{
    		f = 1.0;
    	}
    	*/
    	// Incorporating throttle 
    	throttle = ((-throttle-.5));
    //	SmartDashboard.putNumber("throttle", throttle);
        	// x modification
    	if (Math.abs(x) <= minMotion) { // x can be both positive and negative
    		x = 0;
    	}
    	
    	else {
    		//x = Math.pow(x, pwr) * Math.abs(x)/x; // sqr of value gets better control at low speed
    		x = x * throttle;
    		}
		
    
    	// y modification
    	if (Math.abs(y) <= minMotion) { // y can be both positive and negative
    		y = 0;
    	}
    	
    	else {
    		//y = Math.pow(y, pwr) * Math.abs(y)/y; // sqr of value gets better control at low speed
    		y = y* throttle;
    		}
    		
		/*
    	// t modification
    	if (Math.abs(t) <= minMotion) { // t can be both positive and negative
    		t = 0;
    	}
    	else {
    		t = Math.pow(t, pwr) * Math.abs(t)/t; // sqr of value gets better control at low speed
    		t = t * throttle;
    	}
		*/
    	
		// EVALUATION TEST
		/*
		SmartDashboard.putNumber("DB/Slider 0", x);
		SmartDashboard.putNumber("DB/Slider 1", y);
		SmartDashboard.putNumber("DB/Slider 2", t);
		SmartDashboard.putNumber("DB/Slider 3", throttle);
    	*/
		
    	
    	    	
    	// steer using those variables
    	chassis.driveChassisSteering(-x, -y);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
