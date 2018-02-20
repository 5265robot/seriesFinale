package org.usfirst.frc5265.steamwiffle.commands;

import org.usfirst.frc5265.steamwiffle.RobotMap;
import org.usfirst.frc5265.steamwiffle.subsystems.stagValues;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class armPos extends Command {
	public double pos;
    public armPos(double posi) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	pos = posi;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double pot = RobotMap.analPot.get();
    		if(pot > pos) {
    			RobotMap.arm.set(-stagValues.armPower);
    		}else if(pot < pos) {
    			RobotMap.arm.set(stagValues.armPower);
    		}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        
        if(RobotMap.analPot.get() > pos -.05 && RobotMap.analPot.get() < pos +.05) {
        	return true;
        	
        }else {
        	return false;
        }
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
