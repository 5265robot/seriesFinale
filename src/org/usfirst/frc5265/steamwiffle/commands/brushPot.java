package org.usfirst.frc5265.steamwiffle.commands;

import org.usfirst.frc5265.steamwiffle.Robot;
import org.usfirst.frc5265.steamwiffle.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class brushPot extends Command {
int angle;
    public brushPot(int degrees) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.chassis);
       
       angle = degrees;
       execute();
        
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    	
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(angle == 0){
        	while(RobotMap.pot.get()<.2 || RobotMap.pot.get()>.25){
        		if(RobotMap.pot.get()<.2){
        			Robot.chassis.brushless(.3);
        		}else Robot.chassis.brushless(-.3);
        		
        	}
        	end();
        }else if (angle ==1){
        	while(RobotMap.pot.get()<.6 || RobotMap.pot.get()>.7){
        		if(RobotMap.pot.get()<.6){
        			Robot.chassis.brushless(.3);
        		}else Robot.chassis.brushless(-.3);
        		
        	}
        	end();
        }else if(angle ==2){
        	while(RobotMap.pot.get()<.8 || RobotMap.pot.get()>.85){
        		if(RobotMap.pot.get()<.8){
        			Robot.chassis.brushless(.3);
        		
        		}else Robot.chassis.brushless(-.3);
        		
        	}
        	end();
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassis.brushless(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
