// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class HamsterDrive extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  private final DriveTrainSubsystem _driveTrain;
  private final DoubleSupplier _forward;
  private final DoubleSupplier _rotation;
  
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
   public HamsterDrive(DriveTrainSubsystem driveTrain, DoubleSupplier forward, DoubleSupplier rotation) {
        _driveTrain = driveTrain;
        _forward = forward;
        _rotation = rotation;
        addRequirements(_driveTrain);
    }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
    public void execute() {
        double turnPower = _rotation.getAsDouble() * Math.abs(_forward.getAsDouble());
        _driveTrain.set(_forward.getAsDouble() + turnPower, _forward.getAsDouble() - turnPower);
    }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
