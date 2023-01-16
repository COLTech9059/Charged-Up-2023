// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class DriveTrainSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public TankDriveSubsystem() {}
  
  
  public void setSpeed(double LeftYSpeed, double RightYSpeed) {
        // speed MUST be between -1.0 and 1.0
        LeftYSpeed = LeftY;
        RightYSpeed = RightY;
    
        LeftPrimary.set(LeftYSpeed);
        RightPrimary.set(RightYSpeed);

        System.out.println(leftYSpeed);
    }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
