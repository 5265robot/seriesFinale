package org.usfirst.frc5265.steamwiffle.commands;

import org.usfirst.frc5265.steamwiffle.Robot;
import org.usfirst.frc5265.steamwiffle.RobotMap;
import org.usfirst.frc5265.steamwiffle.subsystems.stagValues;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Lift extends Command {
	public boolean dir;
	public double power;
    public Lift(boolean direction) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.chassis);
    	dir = direction;
    	power = stagValues.Liftpower;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if(dir) {
		RobotMap.brushless.set(power);
    	}else {
    		RobotMap.brushless.set(-power);
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(dir) {
        return  !RobotMap.upper.get();
    	}else {
    		return !RobotMap.lower.get();
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.brushless.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	RobotMap.brushless.set(0);
    }
}
