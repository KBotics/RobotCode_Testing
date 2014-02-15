/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test.main.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author KBotics
 */
public class FlipperCommand extends Command {

    private boolean flipperState = false;
    
    public FlipperCommand() {
        requires(CommandBase.flippers);
    }
    
    protected void initialize() {
        CommandBase.flippers.resetFlippers();
    }

    protected void execute() {
        
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        
    }

    protected void interrupted() {
        end();
    }
    
}
