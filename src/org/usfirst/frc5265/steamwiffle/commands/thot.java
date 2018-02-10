package org.usfirst.frc5265.steamwiffle.commands;

import org.usfirst.frc5265.steamwiffle.subsystems.stagValues;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class thot extends Command {

    public thot() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	double what = stagValues.what;
    	if(what == .5) {
    		stagValues.what = .75;
    	}else if(what == .75) {
    		if(stagValues.toggle) {
    			stagValues.what = .5;
    		}else {
    			stagValues.what = 1.0;
    		}
    		stagValues.toggle = !stagValues.toggle;
    	}else if(what == 1.0) {
    		stagValues.what = .75;
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	

    }
    
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
