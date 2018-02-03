package org.usfirst.frc5265.steamwiffle.commands;
/*
import org.usfirst.frc5265.steamwiffle.Robot;
import org.usfirst.frc5265.steamwiffle.RobotMap;
import org.usfirst.frc5265.steamwiffle.subsystems.chassis;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.networktables.*;
import org.usfirst.frc5265.steamwiffle.commands.DriveByTime;
*/
/**
 *
 
public class autoGo extends Command {
	double[] xEmpty = new double[3];
	//NetworkTable Raspberry;
    public autoGo() {
        // Use requires() here to declare subsystem dependencies
         requires(Robot.chassis);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    boolean on = Robot.Raspberry.putBoolean("isOn", true);	
    //double dist = Robot.ultra();
		
	double xNet[] = Robot.Raspberry.getNumberArray("x", xEmpty);
	double time = Math.abs((xNet[0]-320)/10)/17;
	SmartDashboard.putNumber("timeForTits", time);
	double speed = .25;
	
    	
	Timer.delay(.1);	
if(xNet[0]<340 && xNet[0] > 300){
chassis.driveChassisSteering(0, 0);
end();
}else if(xNet[0]<300){
    		SmartDashboard.putBoolean("right", true);
    	 
    		chassis.driveChassisSteering(0,-speed);
    		Timer.delay(time);
    		chassis.driveChassisSteering(0, 0);
    		SmartDashboard.putBoolean("right", false);
    		end();
    			
}else if(xNet[0]>340){
    		SmartDashboard.putBoolean("Left", true);
    		chassis.driveChassisSteering(0,speed);
    		Timer.delay(time);
    	//		DriveByTime(0, -1, 1, 1);
    		chassis.driveChassisSteering(0, 0);
    		end();	
    		SmartDashboard.putBoolean("Left", false);
    			
    		}if(xNet[0]<340 && xNet[0] > 300){
    		chassis.driveChassisSteering(0, 0);
    		end();
    		}
    	}
    	
    


    	
    

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }
    

    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassis.driveChassisSteering(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
*/