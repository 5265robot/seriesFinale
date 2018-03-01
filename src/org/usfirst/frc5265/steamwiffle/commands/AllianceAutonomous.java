package org.usfirst.frc5265.steamwiffle.commands;

import org.usfirst.frc5265.steamwiffle.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AllianceAutonomous extends Command {
	Command autoMiddle;
	String pos;
    public AllianceAutonomous(String place) {;
    	requires(Robot.chassis);
    	pos = place;
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if(pos == "center") {
    		autoMiddle = new AutoAlliance("center");
    	}
    	else if(pos == "right") {
    		autoMiddle = new AutoAlliance("right");
    	}
    	else if(pos == "left") {
    		autoMiddle = new AutoAlliance("left");    	
    }
    else if(pos == "leftNoScale") {
    		autoMiddle = new AutoAlliance("leftNoScale");
    }
    else if(pos == "rightNoScale") {
    		autoMiddle = new AutoAlliance("rightNoScale");
    }
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	 autoMiddle.start();
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
    }
}
