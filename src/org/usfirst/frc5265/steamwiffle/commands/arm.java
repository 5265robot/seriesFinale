package org.usfirst.frc5265.steamwiffle.commands;

import org.usfirst.frc5265.steamwiffle.RobotMap;
import org.usfirst.frc5265.steamwiffle.subsystems.stagValues;
import edu.wpi.first.wpilibj.command.Command;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class arm extends Command {
	boolean pos;
	private double power = stagValues.armPower;
	private double upLimit = stagValues.upperLimit;
	private double lowLimit = stagValues.lowerLimit;
	boolean stuck;
    public arm() {
        // Use requires() here to declare subsystem dependencies
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    		//RobotMap.arm.enable();
    //	SmartDashboard.putString("stuck", "off");
    		pos = (RobotMap.analPot.get() > lowLimit);
    		
    		stuck = 	(RobotMap.analPot.get()  < lowLimit && RobotMap.analPot.get() > upLimit ); 
    		//SmartDashboard.putString("running", "yes");
    		//SmartDashboard.putBoolean("stuck", stuck);

        		
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    if(stuck) {
		RobotMap.chubby.set(-power);
	//	SmartDashboard.putString("stuck", "yes");

	//	SmartDashboard.putString("on", "yes");
    		}
    else if(pos) {
			RobotMap.chubby.set(-power);
		//	SmartDashboard.putString("on", "yes");
		}
    else {
			RobotMap.chubby.set(power);
		//	SmartDashboard.putString("on", "yes");
		}	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {	
    		//SmartDashboard.putNumber("pot", RobotMap.analPot.get());
    		if(pos || stuck) {
    			if(RobotMap.analPot.get() < upLimit) {
    			//	SmartDashboard.putString("on", "no");

    				RobotMap.chubby.set(0);
    				//RobotMap.arm.disable();
    				return true;
    			}
    		}else {
    			if(RobotMap.analPot.get() > lowLimit) {
    				RobotMap.chubby.set(0);
    				//RobotMap.arm.disable();
    			//	SmartDashboard.putString("on", "no");

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
