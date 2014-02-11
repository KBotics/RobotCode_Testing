/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.main.subsystems;

/**
 *
 * @author Admin
 */

    
import edu.wpi.first.wpilibj.command.Subsystem;
import test.main.RobotMap;
import test.main.commands.CatapultCommand;

public class Catapult extends Subsystem {
    
    
    public void initDefaultCommand() {
        setDefaultCommand(new CatapultCommand());
    }
    
    public void moveMotors(double speed) {
        RobotMap.leftCatapult.set(speed);
        RobotMap.rightCatapult.set(speed);
    }
    
}
