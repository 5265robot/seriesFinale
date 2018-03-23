package org.usfirst.frc5265.steamwiffle.commands;

import org.usfirst.frc5265.steamwiffle.Robot;
import org.usfirst.frc5265.steamwiffle.RobotMap;
import org.usfirst.frc5265.steamwiffle.subsystems.chassis;
import org.usfirst.frc5265.steamwiffle.subsystems.stagValues;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class timeLift extends Command {

	double p;
 // private, public, do you need t?

    public timeLift(double power, double time) {
        // Use requires() here to declare subsystem dependencies
         requires(Robot.chassis);
    
	setTimeout(time);
	p = power;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//if(RobotMap.analPot.get() < stagValues.potCheck || stagValues.tog == false) {
    		chassis.tLift(p);
    	//	Timer.delay(.1);
        	Timer.delay(.1);

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//Robot.chassis.driveChassisSteering(x, y, t);
	// could we put a timer here, one that displays to the dashboard?
	// and use that timer to test that this command finishes when it is supposed to.

    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {

    	if(p < 0) {
        return !RobotMap.lower.get() || isTimedOut();
    	}else {
    		return !RobotMap.upper.get() || isTimedOut();
    	}
    		

    }

    // Called once after isFinished returns true
    protected void end() {

    	chassis.tLift(0);   
    	}


    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
