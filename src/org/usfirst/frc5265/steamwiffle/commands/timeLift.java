package org.usfirst.frc5265.steamwiffle.commands;

import org.usfirst.frc5265.steamwiffle.RobotMap;
import org.usfirst.frc5265.steamwiffle.subsystems.stagValues;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class timeLift extends Command {
	double p,t;
    public timeLift(double power, double time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    
	setTimeout(time);
	p = power;
	t = time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if(RobotMap.analPot.get() < stagValues.potCheck || stagValues.tog == false) {
    		RobotMap.brushless.set(p);
    		Timer.delay(.1);
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//Robot.chassis.driveChassisSteering(x, y, t);

    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.brushless.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
