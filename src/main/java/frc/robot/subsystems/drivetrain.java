/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.DriveArcade;

public class drivetrain extends SubsystemBase {
  /**
   * Creates a new drivetrain.
   */
  Spark motor0Test1 = null;
  Spark motor1Test1 = null;

  DifferentialDrive differentialDrive = null;

  public drivetrain() {
    motor0Test1 = new Spark(RobotMap.DRIVETRAIN_MOTOR_0_TEST_1);
    motor1Test1 = new Spark(RobotMap.DRIVETRAIN_MOTOR_1_TEST_1);

    differentialDrive = new DifferentialDrive(motor0Test1, motor1Test1);
  }
  public void arcadeDrive(double moveSpeed, double rotateSpeed){
    differentialDrive.arcadeDrive(moveSpeed, rotateSpeed);
  }

  public void initDefaultCommand(){
    setDefaultCommand(new DriveArcade());
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
