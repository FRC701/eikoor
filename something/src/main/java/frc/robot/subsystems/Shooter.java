// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.MotorAlignmentValue;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
  /** Creates a new Shooter. */
private TalonFX TrisketShooter1;
private TalonFX TrisketShooter2;

public Shooter () {
TrisketShooter1 = new TalonFX(Constants.ShooterConstants.kTrisketShooter1);
TrisketShooter2 = new TalonFX(Constants.ShooterConstants.kTrisketShooter2);


TrisketShooter1.setControl(
  new Follower(TrisketShooter2.getDeviceID(), MotorAlignmentValue.Opposed));
}

public void ShootTrisketMotor (){
  TrisketShooter2.setVoltage(25);
}
public void StopTrisketMotor (){
  TrisketShooter2.setVoltage(0);
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
