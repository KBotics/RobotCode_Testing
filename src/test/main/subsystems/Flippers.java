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
    DoubleSolenoid rightFlipper = RobotMap.rightFlipper;
    DoubleSolenoid leftFlipper = RobotMap.leftFlipper;
    DoubleSolenoid peter = RobotMap.peter;
    DoubleSolenoid leftBrake = RobotMap.leftBrake;
    DoubleSolenoid rightBrake = RobotMap.rightBrake;
    boolean state = true;
    
    protected void initDefaultCommand() {
        //setDefaultCommand(new FlipperCommand());
    }
    
    public void flippersSwitch() 
    {
        if(state)
        {
            state = false;
            rightFlipper.set(DoubleSolenoid.Value.kReverse);
            leftFlipper.set(DoubleSolenoid.Value.kReverse);
            peter.set(DoubleSolenoid.Value.kReverse);
            leftBrake.set(DoubleSolenoid.Value.kReverse);
            rightBrake.set(DoubleSolenoid.Value.kReverse);
        }
        else
        {
            state = true;
            rightFlipper.set(DoubleSolenoid.Value.kForward);
            leftFlipper.set(DoubleSolenoid.Value.kForward);
            peter.set(DoubleSolenoid.Value.kForward);
            leftBrake.set(DoubleSolenoid.Value.kForward);
            rightBrake.set(DoubleSolenoid.Value.kForward);
        }
    }
}