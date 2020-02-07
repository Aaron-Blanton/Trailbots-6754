/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.RobotMap;
import frc.robot.subsystems.drivetrain;

public class DriveArcade extends CommandBase {
  /**
   * Creates a new DriveArcade.
   */
  public DriveArcade() {
    requires (Robot.m_drivetrain);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  private void requires(final drivetrain m_drivetrain) {
}

// Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    final double moveSpeed = Robot.m_robotContainer.driverController.getRawAxis(RobotMap.ROBOTCONTAINER_DRIVER_MOVE_AXIS);
    final double rotateSpeed = Robot.m_robotContainer.driverController.getRawAxis(RobotMap.ROBOTCONTAINER_DRIVER_ROTATE_AXIS);

    Robot.m_drivetrain.arcadeDrive(moveSpeed, rotateSpeed);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }

  // Called when another command which requires one or more of the same subsystems is scheduled to run
  public void interrupted(){
    end();
  }

  // Called once the command ends or is interrupted. isFinished=true
  public void end() {
    Robot.m_drivetrain.arcadeDrive(0,0);
  }
}
