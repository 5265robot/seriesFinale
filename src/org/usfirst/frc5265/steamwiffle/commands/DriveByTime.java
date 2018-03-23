package org.usfirst.frc5265.steamwiffle.commands;

import org.usfirst.frc5265.steamwiffle.Robot;
import org.usfirst.frc5265.steamwiffle.RobotMap;
//import org.usfirst.frc5265.steamwiffle.subsystems.chassis;
import org.usfirst.frc5265.steamwiffle.subsystems.chassis;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveByTime extends Command {
	public double xx, yy, tt, time;
	private SpeedController lf = RobotMap.chassisSpeedController0;
	private SpeedController rf = RobotMap.chassisSpeedController1;
	private SpeedController rr = RobotMap.chassisSpeedController2;
	private SpeedController lr = RobotMap.chassisSpeedController1;
	

    public DriveByTime(double x, double y, double time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.chassis);
    	setTimeout(time);
    	xx = x;
    	yy = y;
   // 	tt = t;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	chassis.driveChassisSteering(xx,yy);
  /*  	if(xx>0) {
    		lf.set(xx);
    		rf.set(xx);
    		rr.set(xx);
    		lr.set(xx);
    	}else {
    		lf.set(-yy);
    		rf.set(yy);
    		rr.set(yy);
    		lr.set(-yy);
    	}
    	*/
    	//chassis.driveChassisSteering(xx, yy);
    	Timer.delay(.1);
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
   // 	chassis.driveChassisSteering(0, 0);
    	chassis.driveChassisSteering(xx,yy);

    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
