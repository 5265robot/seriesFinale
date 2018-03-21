package org.usfirst.frc5265.steamwiffle.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class stagValues extends Subsystem {

    // All the variables we want to be able to modify
	// during a match will go here,
	// and then be put on the dashboard
	//for solTest
    
	//TRUE IS IN FALSE IS OUT
	public static boolean tog = true;
	// DRIVING
	public static final double minimumMotionJoystick = 0.3; // zero for calibration
    //first letter is which alliance
	//second number is which stage 
	//if theres an "n" it means with no scale
	//forth/third is x power y power and t time
	//Left Alliance Autonomous
	public static final double l1x = .5, l1y = 0, l1t = 2.2;
	//2nd stage for no scale "n"
	//X is forward
	//Y is twist
	public static final double l1nx = -.65, l1ny = 0.0, l1nt = 2;
	//twist
	public static final double l2x = 0.0, l2y = .5, l2t = .7;
	public static final double l3x = 0.0, l3y = 0.0, l3t = 1.0;
	/* commented out because the lefts are the same with opposite twists 
	// Right Alliance Autonomous 
	public static final double r1x = 0.1, r1y = 0.0, r1t = 1.0;
	//2nd stage for no scale "n"
	public static final double r2nx = 0.0, r2ny = 1.0, r2nt = 1.0;
	public static final double r2x = 0.0, r2y = 1.0, r2t = 1.0;
	public static final double r3x = 0.0, r3y = 1.0, r3t = 1.0;
	*/
	// Center Alliance Autonomous
	public static final double c1x = 0.0, c1y = .5, c1t = .25;
	public static final double c2x = -.65, c2y = .0, c2t = 1.5;
	public static final double c3x = -.65, c3y = -0.0, c3t = .20;
	public static final double c4x = 0.0, c4y = 0.5, c4t = 1.0;
	public static final double c5x = 0.0, c5y = 0.5, c5t = 1.0;
	public static final double c6x = 0.0, c6y = 0.5, c6t = 1.0;
	//auto lift times and power
	
	//POWER NEEDS TO BE NEGATIVE
	public static final double allUpT = 0.25, allUpP = -0.7, halfUpT = .25, halfUpP = -.7;
	
	//Lift power
	public static double Liftpower =  1.0;
	
    public static boolean dead = false;
	
	//Arm power and pot limits
	public static final double upperLimit = .12;
	public static final double lowerLimit = .35;
	public static final double armPower = -.475;
	
	// limit for making sure arm is out of pot when solenoid fires
	public static final double potCheck = .26;
	public static final double startPos = .34;
	public static final double maxH = .24;

	//arm pos for up pos
	public static final double armPos = .23;

    public void initDefaultCommand() {
        // This is where we put the above values to the SmartDashboard
    	// using SmartDashboard.put ...
 
    

    }
}

