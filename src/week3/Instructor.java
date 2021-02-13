package week3;

/**
 * A class representing an instructor of car driving classes.
 * 
 * @author Ramadevi
 *
 */
public class Instructor {

	/**
	 * Instructs the student to enter in the car.
	 * 
	 * @param student Student
	 */
	public void instructEnter(Student student) {
		Command command = new EnterCarCommand(student);
		command.execute();
	}

	/**
	 * Instructs the student to leave the car.
	 * 
	 * @param student Student
	 */
	public void instructLeave(Student student) {
		Command command = new LeaveCarCommand(student);
		command.execute();
	}

	/**
	 * Instructs the student to start the car engine.
	 * 
	 * @param student Student
	 */
	public void instructStart(Student student) {
		Command command = new StartCarCommand(student);
		command.execute();
	}

	/**
	 * Instructs the student to stop the car engine.
	 * 
	 * @param student Student
	 */
	public void instructStop(Student student) {
		Command command = new StopCarCommand(student);
		command.execute();
	}

	/**
	 * Undoes last instruction.
	 * 
	 * @param student Student
	 */
	public void instructUndo(Student student) {
		Command command = new StudentCommand(student);
		command.undo();
	}

	/**
	 * Redoes undone instruction.
	 * 
	 * @param student Student
	 */
	public void instructRedo(Student student) {
		Command command = new StudentCommand(student);
		command.redo();
	}
}
