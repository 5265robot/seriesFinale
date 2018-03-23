package org.usfirst.frc5265.steamwiffle.commands;

import org.usfirst.frc5265.steamwiffle.RobotMap;
import org.usfirst.frc5265.steamwiffle.subsystems.stagValues;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class SolTest extends Command {

    public SolTest() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	SmartDashboard.putNumber("pot", RobotMap.analPot.get());
    	if(RobotMap.analPot.get() < stagValues.potCheck) {
    		if(stagValues.tog) {
    			RobotMap.airDoubleSolenoid1.set(DoubleSolenoid.Value.kForward);
    			stagValues.tog = !stagValues.tog;
    		}else {
    			RobotMap.airDoubleSolenoid1.set(DoubleSolenoid.Value.kReverse);
    			stagValues.tog = !stagValues.tog;
    		}
    		
    		}
    	
    SmartDashboard.putBoolean("toggle", stagValues.tog);
    	end();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

                                                                                                                                                                                                                                                                                    // Called once after isFinished returns true
    protected void end() {
    //RobotMap.airDoubleSolenoid1.set(DoubleSolenoid.Value.kReverse);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
