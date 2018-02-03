package org.usfirst.frc5265.steamwiffle.commands;

import org.usfirst.frc5265.steamwiffle.Robot;
import org.usfirst.frc5265.steamwiffle.subsystems.stagValues;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CenterAlliance extends CommandGroup {

    public CenterAlliance() {
    	requires(Robot.chassis);
    	requires(Robot.stagValues);
    	
    	double caa1dx = stagValues.caa01dx, caa1dy = stagValues.caa01dy, caa1dt = stagValues.caa01dt, caa1dtime = stagValues.caa01dtime;
    	double caa2dx = stagValues.caa02dx, caa2dy = stagValues.caa02dy, caa2dt = stagValues.caa02dt, caa2dtime = stagValues.caa02dtime;
    	double caa3dx = stagValues.caa03dx, caa3dy = stagValues.caa03dy, caa3dt = stagValues.caa03dt, caa3dtime = stagValues.caa03dtime;
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
    	addSequential(new DriveByTime(caa1dx , caa1dy, caa1dt, caa1dtime));
    	//addParallel(new shooter(0.48));
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
