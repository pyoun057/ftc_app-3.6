package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

@Autonomous(name="Robot", group="Linear Opmode")
@Disabled
public class Robot extends LinearOpMode {

    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();

    //Declares Motor Objects
    DcMotor leftMotor;
    DcMotor rightMotor;

    //Declares Motor Function Arrays
    int powerForward[] = {1, 1};
    int powerTurnLeft[] = {-1, 1};
    int powerTurnRight[] = {1, -1};

    //Runs the OpMode
    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        leftMotor = hardwareMap.dcMotor.get("Left Motor");
        rightMotor = hardwareMap.dcMotor.get("Right Motor");

        leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        leftMotor.setPower(powerForward[0]);
        leftMotor.setPower(powerForward[1]);

        waitForStart();
        runtime.reset();
    }
}

