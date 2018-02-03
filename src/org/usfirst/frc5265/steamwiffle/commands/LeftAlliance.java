package org.usfirst.frc5265.steamwiffle.commands;

import org.usfirst.frc5265.steamwiffle.Robot;
import org.usfirst.frc5265.steamwiffle.subsystems.stagValues;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftAlliance extends CommandGroup {
	

    public LeftAlliance() {
    	requires(Robot.chassis);
    	requires(Robot.stagValues);
    	
    	double laa1dx = stagValues.laa01dx, laa1dy = stagValues.laa01dy, laa1dt = stagValues.laa01dt, laa1dtime = stagValues.laa01dtime;
    	double laa2dx = stagValues.laa02dx, laa2dy = stagValues.laa02dy, laa2dt = stagValues.laa02dt, laa2dtime = stagValues.laa02dtime; 
    	double laa3dx = stagValues.laa03dx, laa3dy = stagValues.laa03dy, laa3dt = stagValues.laa03dt, laa3dtime = stagValues.laa03dtime;
    	
    	// Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
    	addSequential(new DriveByTime(laa1dx, laa1dy, laa1dt, laa1dtime));
    	addSequential(new DriveByTime(laa3dx, laa3dy, laa3dt, laa3dtime));
    	addSequential(new DriveByTime(laa2dx, laa2dy, laa2dt, laa2dtime));
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
