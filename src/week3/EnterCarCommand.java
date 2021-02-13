package week3;

/**
 * A class representing a command to be given to a student to enter in the car.
 * 
 * @author Ramadevi
 *
 */
public class EnterCarCommand extends StudentCommand {

	/**
	 * Create command object.
	 * 
	 * @param student Student
	 */
	public EnterCarCommand(Student student) {
		super(student);
		description = ENTER;
	}

	/**
	 * Execute the operation and add to the history.
	 */
	@Override
	public void execute() {
		student.enter();
		addToHistory();
	}

}
