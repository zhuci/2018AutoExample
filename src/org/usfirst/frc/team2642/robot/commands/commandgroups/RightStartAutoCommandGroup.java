package org.usfirst.frc.team2642.robot.commands.commandgroups;

import org.usfirst.frc.team2642.robot.commands.DriveByGyro;
import org.usfirst.frc.team2642.robot.commands.PlaceHolderCommand;
import org.usfirst.frc.team2642.robot.commands.TurnByGyro;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightStartAutoCommandGroup extends CommandGroup {

    public RightStartAutoCommandGroup() {
    	//Basic Auto (drive past auto-line)
    	//addSequential(new DriveByGyro(0, .8, 96, false));
    	
    	//Drive to scale
    	/*addSequential(new DriveByGyro(0, .6, 96, false));
    	addSequential(new DriveByGyro(0, .6, 74, false));
    	addSequential(new DriveByGyro(-32, .57, 42, false));
    	addSequential(new DriveByGyro(-10, .6, 24, false));*/
    	
    	//Drive to right side of switch
    	/*addSequential(new DriveByGyro(15, .6, 60, false));
    	addSequential(new DriveByGyro(0, .6, 90, false));
    	addSequential(new TurnByGyro(-90, 1));
    	addSequential(new DriveByGyro(-90, .6, 12, false));
    	addSequential(new PlaceHolderCommand(3));
    	addSequential(new TurnByGyro(0, 1));*/
    	
    	//Drive to right side of switch then to right side of scale
    	/*addSequential(new DriveByGyro(0, .8, 140, false));
    	addSequential(new TurnByGyro(-90, 1));
    	addSequential(new DriveByGyro(-90, .8, 5, false));
    	addSequential(new PlaceHolderCommand(.5));
    	addSequential(new TurnByGyro(-5, 2));
    	addSequential(new DriveByGyro(0, .8, 55, false));
    	addSequential(new TurnByGyro(-137, 2));
    	addSequential(new DriveByGyro(-137, .8, 12, false));
    	addSequential(new PlaceHolderCommand(.5));
    	addSequential(new TurnByGyro(-25, 2));
    	addSequential(new DriveByGyro(-25, .8, 20, false));
    	addSequential(new DriveByGyro(0, .8, 10, false));
    	addSequential(new TurnByGyro(-2, 2));*/
    	
    	//Right scale right switch
    	addSequential(new DriveByGyro(0, .8, 163, false));
    	addSequential(new DriveByGyro(-34, .8, 62, false));
    	addSequential(new DriveByGyro(-25, .8, 2, false));
    	addSequential(new DriveByGyro(-10, .8, 2, false));
    	addSequential(new DriveByGyro(0, .8, 24, false));
    	addSequential(new TurnByGyro(0, 2));
    	addSequential(new PlaceHolderCommand(.8));/*
    	addSequential(new DriveByGyro(0, -.8, 8, false));
    	addSequential(new DriveByGyro(0, -.8, 8, false));
    	addSequential(new PlaceHolderCommand(1.5));
    	addSequential(new TurnByGyro(-161, 2));
    	addSequential(new DriveByGyro(-163, .8, 18, false));
    	addSequential(new PlaceHolderCommand(1.5));
    	addSequential(new DriveByGyro(-125, -.8, 12, false));
    	addSequential(new DriveByGyro(-125, .8, 16, false));*/
    	
    	//left scale left switch
    	/*addSequential(new DriveByGyro(0, .9, 184, false));
    	addSequential(new DriveByGyro(-20, .9, 3, false));
    	addSequential(new DriveByGyro(-40, .9, 3, false));
    	addSequential(new DriveByGyro(-60, .9, 3, false));
    	addSequential(new DriveByGyro(-80, .9, 3, false));
    	addSequential(new TurnByGyro(-90, 2));
    	addSequential(new DriveByGyro(-90, .8, 75, false));
    	addSequential(new DriveByGyro(-90, .6, 55, false));
    	addSequential(new DriveByGyro(-90, .8, 58, false));
    	addSequential(new TurnByGyro(0, 2));
    	addSequential(new DriveByGyro(0, .8, 24, false));
    	addSequential(new PlaceHolderCommand(.8));
    	addSequential(new DriveByGyro(0, -.8, 6, false));
    	addSequential(new DriveByGyro(0, -.8, 6, false));
    	addSequential(new PlaceHolderCommand(1.5));
    	addSequential(new TurnByGyro(165, 2));
    	addSequential(new DriveByGyro(165, .8, 20, false));*/
    }
}
