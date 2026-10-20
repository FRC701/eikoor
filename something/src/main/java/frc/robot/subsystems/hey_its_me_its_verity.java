// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix6.hardware.TalonFX;

public class hey_its_me_its_verity extends SubsystemBase {
  /** Creates a new hey_its_me_its_verity. */
   private TalonFX m_IntakeMotorArm;
  public hey_its_me_its_verity() {
   m_IntakeMotorArm = new TalonFX();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

 
}
