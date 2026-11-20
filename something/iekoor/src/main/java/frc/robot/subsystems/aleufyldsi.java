// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.MotorAlignmentValue;

public class aleufyldsi extends SubsystemBase {
  /** Creates a new aleufyldsi. */
  private TalonFX Mooootor_1;
  private TalonFX Mooootor_2;
  public aleufyldsi() {
    Mooootor_1 = new TalonFX(Constants.aleufyldsiConstants.Mooootor_1);
    Mooootor_2 = new TalonFX(Constants.aleufyldsiConstants.Mooootor_2);

    Mooootor_2.setControl(
      new Follower(Mooootor_1.getDeviceID(), MotorAlignmentValue.Opposed)
    );
  }

  public void spinMooootor() {
    Mooootor_1.setVoltage(5);
  }
  public void stopMooootor() {
    Mooootor_1.setVoltage(0);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
