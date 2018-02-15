package org.usfirst.frc5265.steamwiffle.commands;

import org.usfirst.frc5265.steamwiffle.RobotMap;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class arm extends Command {
	boolean pos;
    public arm() {
        // Use requires() here to declare subsystem dependencies
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    		RobotMap.arm.enable();
    		pos = (RobotMap.analPot.get() > .7);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    			if(pos) {
    				RobotMap.arm.set(-.3);
    			}else {
    				RobotMap.arm.set(.3);
    			}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    		SmartDashboard.putNumber("pot", RobotMap.analPot.get());
    		if(pos) {
    			if(RobotMap.analPot.get() < .4) {
    				RobotMap.arm.set(0);
    				RobotMap.arm.disable();
    				return true;
    			}
    		}else {
    			if(RobotMap.analPot.get() > .8) {
    				RobotMap.arm.set(0);
    				RobotMap.arm.disable();
    				return true;
    			}
    		}
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
