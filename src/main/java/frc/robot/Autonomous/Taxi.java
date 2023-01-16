package frc.robot.autonomous;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.HamsterDrive;
import frc.robot.subsystems.DriveTrainSubsystem;

public class Taxi extends SequentialCommandGroup {
    public Taxi(DriveTrainSubsystem driveTrain) {
        addCommands(
            // drive forward with speed of 0.5 and turn of 0; interrupt after 3 seconds
            new HamsterDrive(driveTrain, () -> 0.5, () -> 0).withTimeout(3),
            // drive backward with speed of 0.5 and turn of 0; interrupt after 8 seconds
            new HamsterDrive(driveTrain, () -> -0.5, () -> 0).withTimeout(8),
            // stop the motors
            new HamsterDrive(driveTrain, () -> 0, () -> 0);
        );
    }
}