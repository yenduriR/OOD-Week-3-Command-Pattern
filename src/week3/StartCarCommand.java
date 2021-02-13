package week3;

/**
 * A class representing a command to be given to a student to start the car.
 * 
 * @author Ramadevi
 *
 */
public class StartCarCommand extends StudentCommand {

	/**
	 * Create command object.
	 * 
	 * @param student Student
	 */
	public StartCarCommand(Student student) {
		super(student);
		description = START;
	}

	/**
	 * Execute the operation and add to the history.
	 */
	@Override
	public void execute() {
		student.start();
		addToHistory();
	}

}
