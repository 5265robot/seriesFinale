package org.usfirst.frc5265.steamwiffle.commands;

import org.usfirst.frc5265.steamwiffle.Robot;
import org.usfirst.frc5265.steamwiffle.subsystems.stagValues;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightAlliance extends CommandGroup {

    public RightAlliance() {
    	requires(Robot.chassis);
    	requires(Robot.stagValues);
    	
    	double raa1dx = stagValues.raa01dx, raa1dy = stagValues.raa01dy, raa1dt = stagValues.raa01dt, raa1dtime = stagValues.raa01dtime;
    	double raa2dx = stagValues.raa02dx, raa2dy = stagValues.raa02dy, raa2dt = stagValues.raa02dt, raa2dtime = stagValues.raa02dtime;
        //double range = Robot.
    	// Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
    	//addSequential(new DriveByTime(raa1dx,raa1dy, raa1dt, raa1dtime));
    	addSequential(new DriveByTime(raa2dx, raa2dy, raa2dt, raa2dtime));
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
