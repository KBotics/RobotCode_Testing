/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.main.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author Admin
 */
public class CatapultCommand extends Command {
    
    public CatapultCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(CommandBase.catapult);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        double left = CommandBase.oi.Xbox.getJoyLeftY();
        CommandBase.catapult.moveMotors(left);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        CommandBase.catapult.moveMotors(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
