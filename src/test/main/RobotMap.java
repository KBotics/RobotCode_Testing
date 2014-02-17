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
    private static final int PETER_PORT_1 = 1;
    private static final int PETER_PORT_2 = 2;
    private static final int LFLIP_PORT_1 = 1;
    private static final int LFLIP_PORT_2 = 2;
    private static final int RFLIP_PORT_1 = 3;
    private static final int RFLIP_PORT_2 = 4;
    private static final int RBRAKE_PORT_1 = 5;
    private static final int RBRAKE_PORT_2 = 6;
    private static final int LBRAKE_PORT_1 = 3;
    private static final int LBRAKE_PORT_2 = 4;
    public static DoubleSolenoid rightFlipper, leftFlipper, peter, leftBrake, rightBrake;
   // public static Compressor airCompressor;
    
    public static void init() {
      
      // airCompressor = new Compressor(1, 1);
      //  airCompressor.start();
        rightFlipper = new DoubleSolenoid(1, RFLIP_PORT_1, RFLIP_PORT_2);
        leftFlipper  = new DoubleSolenoid(1, LFLIP_PORT_1, LFLIP_PORT_2);
        peter        = new DoubleSolenoid(2, PETER_PORT_1, PETER_PORT_2);
        leftBrake    = new DoubleSolenoid(2, LBRAKE_PORT_1, LBRAKE_PORT_2);
        rightBrake   = new DoubleSolenoid(2, RBRAKE_PORT_1, RBRAKE_PORT_2);
        
        rightFlipper.set(DoubleSolenoid.Value.kOff);
        leftFlipper.set(DoubleSolenoid.Value.kOff);
        peter.set(DoubleSolenoid.Value.kOff);
        leftBrake.set(DoubleSolenoid.Value.kOff);
        rightBrake.set(DoubleSolenoid.Value.kOff);
    }
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
}
