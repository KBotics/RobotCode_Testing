/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test.main.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import test.main.RobotMap;
import test.main.commands.FlipperCommand;

/**
 *
 * @author KBotics
 */
public class Flippers extends Subsystem{

    protected void initDefaultCommand() {
        setDefaultCommand(new FlipperCommand());
    }
    
    public void resetFlippers() {
        RobotMap.leftFlipper.set(DoubleSolenoid.Value.kReverse);
        //RobotMap.rightFlipper.set(false);
    }
    
    public void flippersSwitch(boolean state) {
        if (state) {
            state = false;
            RobotMap.rightFlipper.set(DoubleSolenoid.Value.kReverse);
            RobotMap.leftFlipper.set(DoubleSolenoid.Value.kReverse);
        } else {
            state = true;
            RobotMap.rightFlipper.set(DoubleSolenoid.Value.kForward);
            RobotMap.leftFlipper.set(DoubleSolenoid.Value.kForward);
        }
    }
}