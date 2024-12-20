// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.subsystems.drive.SwerveDrive;
public class Robot extends TimedRobot {
    private final SwerveDrive drive = new SwerveDrive(true);//2-10 Works
    private RobotContainer robotContainer = new RobotContainer();
  
    @Override
    public void robotInit() {}

    @Override
    public void robotPeriodic() {
        CommandScheduler.getInstance().run();
    }

    @Override
    public void disabledInit() {}
    
    @Override
    public void disabledPeriodic() {}

    @Override
    public void autonomousInit() {}

    @Override
    public void autonomousPeriodic() {}
    
    @Override
    public void teleopInit() {
        CommandScheduler.getInstance().cancelAll();
		DriverStation.silenceJoystickConnectionWarning(true);
        robotContainer.testDrive(drive);
    }

    @Override
    public void teleopPeriodic() {}
    
    @Override
    public void testInit() {
        CommandScheduler.getInstance().cancelAll();
    }
    @Override
    public void testPeriodic() {}

    @Override
    public void simulationInit() {}

    @Override
    public void simulationPeriodic() {}

    @Override
    public void teleopExit(){}


        
}