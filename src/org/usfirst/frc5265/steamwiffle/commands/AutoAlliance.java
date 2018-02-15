package org.usfirst.frc5265.steamwiffle.commands;

import org.usfirst.frc5265.steamwiffle.Robot;
//import org.usfirst.frc5265.steamwiffle.RobotMap;
import org.usfirst.frc5265.steamwiffle.subsystems.stagValues;

//import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoAlliance extends CommandGroup {
	String gameData = DriverStation.getInstance().getGameSpecificMessage();

    public AutoAlliance(String auto) {
    //	requires(Robot.chassis);
    	requires(Robot.stagValues);
    
    	
    	
    	//CENTER AUTO
    	if(auto == "center") {
    	double caa1dx = stagValues.caa01dx, caa1dy = stagValues.caa01dy,  caa1dtime = stagValues.caa01dtime;
    //	double caa2dx = stagValues.caa02dx, caa2dy = stagValues.caa02dy, caa2dt = stagValues.caa02dt, caa2dtime = stagValues.caa02dtime;
    //	double caa3dx = stagValues.caa03dx, caa3dy = stagValues.caa03dy, caa3dt = stagValues.caa03dt, caa3dtime = stagValues.caa03dtime;
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
    //	addParallel(new)
    	//forward
    	addSequential(new DriveByTime(caa1dx , caa1dy, caa1dtime));
    	//lift up
    	addParallel(new timeLift(.5,.5));
    	//turn toward L or R
    	if(gameData.charAt(0) == 'R') {
    		addSequential(new DriveByTime(caa1dx , caa1dy, caa1dtime));
    	}else {
    	    addSequential(new DriveByTime(caa1dx , caa1dy, caa1dtime));
    	}
    	// turn towards low goal
    	if(!(gameData.charAt(0) == 'R')) {
    		addSequential(new DriveByTime(caa1dx , caa1dy, caa1dtime));
    	}else {
    	    addSequential(new DriveByTime(caa1dx , caa1dy, caa1dtime));
    	}
    		addSequential(new SolTest());
    	}
    	
    	
    	
    	
    	//RIGHT AUTO
    	if(auto == "right") {
    		double raa2dx = stagValues.raa02dx, raa2dy = stagValues.raa02dy, raa2dtime = stagValues.raa02dtime;
    		
    		
    		
    		
    		
    		
    	}
    	
    	
    	
    	
    	
    	//LEFT AUTO
    	if(auto == "left") {
        	double laa1dx = stagValues.laa01dx, laa1dy = stagValues.laa01dy, laa1dtime = stagValues.laa01dtime;
        	double laa2dx = stagValues.laa02dx, laa2dy = stagValues.laa02dy, laa2dtime = stagValues.laa02dtime; 
        	double laa3dx = stagValues.laa03dx, laa3dy = stagValues.laa03dy, laa3dtime = stagValues.laa03dtime;
    		
    		
    		
    		
    		
    		
    	}
    	
    	//addSequential(new DriveByTime(caa2dx, caa2dy, caa2dt, caa2dtime));
    	//addSequential(new DriveByTime(caa3dx, caa3dy, caa3dt, caa3dtime));
    	//addSequential(new IntakeCommand(0.5));
        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
