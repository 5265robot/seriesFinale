// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5265.steamwiffle;

import org.usfirst.frc5265.steamwiffle.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc5265.steamwiffle.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton click01;
    public Joystick steering;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        steering = new Joystick(0);
        
        
        click01 = new JoystickButton(steering, 1);
        click01.whileHeld(new dothis01());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("dothis01", new dothis01());
        //SmartDashboard.putData("Setpoint Command 1", new SetpointCommand1());
        SmartDashboard.putData("Timed Command 1", new TimedCommand1());
        SmartDashboard.putData("Instant Command 1", new InstantCommand1());
        SmartDashboard.putData("Command Group 1", new CommandGroup1());
        SmartDashboard.putData("PID Command 1", new PIDCommand1());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getsteering() {
        return steering;
    }
    public double getXSteer() {
        return steering.getX(); //look up what the actual axis number is
    }
    public double getYSteer() {
        return steering.getY(); //look up what the actual axis number is
    }
    public double getTwistSteer() {
        return steering.getTwist(); //look up what the actual axis number is
    }
    public double getPolarDegrees() {
    	return steering.getDirectionDegrees();
    }
    public double getPolarRadians() {
    	return steering.getDirectionRadians();
    }
    public double getPolarMagnitude() {
    	return steering.getMagnitude();	
    }
    public double getThrottle() {
    	return steering.getThrottle();
    }
    
    
  

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

