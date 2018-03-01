package org.usfirst.frc5265.steamwiffle.commands;

import org.usfirst.frc5265.steamwiffle.RobotMap;
import org.usfirst.frc5265.steamwiffle.subsystems.stagValues;

import edu.wpi.first.wpilibj.command.Command;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class armPos extends Command {
	public double pos;
	double power = stagValues.armPower;
 	boolean bet = true;
 	public double pot;
 	public double fudge = 0.002;
	
 	public armPos(double posi) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	pos = posi;
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
		SmartDashboard.putString("on", "off");
		// bet = (pot > pos + .05) || (pot < pos -.05);
		
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    pot = RobotMap.analPot.get();
    	bet = ((pot > pos + fudge) || (pot < pos - fudge));
    	if(bet) {
    		
    		if(RobotMap.analPot.get() > pos) {
    			RobotMap.chubby.set(-power);
    		//	SmartDashboard.putString("on", "yes");
    		}
        else {
    			RobotMap.chubby.set(power);
    		//	SmartDashboard.putString("on", "yes");
    		}	
    	}
    		

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
	    	pot = RobotMap.analPot.get();
	    	bet = ((pot > pos + fudge) || (pot < pos - fudge));
	    	if(!bet) {
    			RobotMap.chubby.set(0);
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
	//	RobotMap.arm.set(0);

    }
}
