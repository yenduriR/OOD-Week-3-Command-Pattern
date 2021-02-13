package week3;

/**
 * A class representing a command to be given to a student to stop the car.
 * 
 * @author Ramadevi
 *
 */
public class StopCarCommand extends StudentCommand {

	/**
	 * Create command object.
	 * 
	 * @param student Student
	 */
	public StopCarCommand(Student student) {
		super(student);
		description = STOP;
	}

	/**
	 * Execute the operation and add to the history.
	 */
	@Override
	public void execute() {
		student.stop();
		addToHistory();
	}

}
