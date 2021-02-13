package week3;

/**
 * A class representing a command to be given to a student to leave the car.
 * 
 * @author Ramadevi
 *
 */
public class LeaveCarCommand extends StudentCommand {

	/**
	 * Create command object.
	 * 
	 * @param student Student
	 */
	public LeaveCarCommand(Student student) {
		super(student);
		description = LEAVE;
	}

	/**
	 * Execute the operation and add to the history.
	 */
	@Override
	public void execute() {
		student.leave();
		addToHistory();
	}
}
