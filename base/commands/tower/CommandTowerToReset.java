package red.crusade.base.commands.tower;

import red.crusade.base.RobotMap;
import red.crusade.superclasses.CommandRC;

/**
 *
 * @author Sean Zammit
 */
public class CommandTowerToReset extends CommandRC
{
	public CommandTowerToReset() {
		super(tower);
	}

	//Set up what the robot will do while this command is running.
	protected void execute() {
		tower.towerMotor.set(RobotMap.towerSpeed);
	}
	
	//Determine the conditions that will stop this command.
	protected boolean isDone() {
		return sensors.getTowerSwitchTop();
	}

	//Turn off your motors or solenoids used in this command.
	protected void onCompletion() {
		tower.towerMotor.set(0);
	}
}
