/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team948.robot.subsystems;

import org.usfirst.frc.team948.robot.commands.ExampleCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DrivetrainSubsystem extends Subsystem {
	private Talon leftTalon = new Talon(0);
	private Talon rightTalon = new Talon(1);
	
	@SuppressWarnings("deprecation")
	private RobotDrive drive = new RobotDrive(leftTalon, rightTalon);
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new ExampleCommand());
		
	}
	
	public void drive(double x, double y) {
		drive.tankDrive(x, y);
	}
}
