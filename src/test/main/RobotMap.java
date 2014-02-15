package test.main;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    private static final int catapult_leftMotor  = 6;
    private static final int catapult_rightMotor = 2;
    
    public static SpeedController leftCatapult;
    public static SpeedController rightCatapult;
    
    public static DoubleSolenoid leftFlipper, rightFlipper;
    
   // public static Compressor airCompressor;
    
    public static void init() {
        
       // airCompressor = new Compressor(1, 1);
      //  airCompressor.start();
        leftFlipper = new DoubleSolenoid(1, 2);
        
        leftCatapult  = new Talon(catapult_leftMotor);
        rightCatapult = new Talon(catapult_rightMotor);
    }
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
}
