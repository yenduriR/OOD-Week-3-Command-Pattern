package week3;

/**
 * A class representing generic command for students.
 * 
 * @author Ramadevi
 *
 */
public class StudentCommand extends Command {

	public static String ENTER = "enter";
	public static String LEAVE = "leave";
	public static String START = "start";
	public static String STOP = "stop";

	Student student;

	/**
	 * Create student command.
	 * 
	 * @param student Student
	 */
	public StudentCommand(Student student) {
		this.student = student;
	}

	/**
	 * To be overridden by subclasses if necessary.
	 */
	public void execute() {
	}

	/**
	 * Undoes last operation that the student has performed.
	 */
	@Override
	public void undo() {

		if (pointer >= 0) {
			String prevDesc = history.get(pointer--);

			if (prevDesc.equals(ENTER)) {
				student.leave();
			} else if (prevDesc.equals(LEAVE)) {
				student.enter();
			} else if (prevDesc.equals(START)) {
				student.stop();
			} else if (prevDesc.equals(STOP)) {
				student.start();
			}
		}
	}

	/**
	 * Redoes the last undone operation.
	 */
	@Override
	public void redo() {
		if (pointer < history.size() - 1) {
			String nextDesc = history.get(++pointer);

			if (nextDesc.equals(ENTER)) {
				student.enter();
			} else if (nextDesc.equals(LEAVE)) {
				student.leave();
			} else if (nextDesc.equals(START)) {
				student.start();
			} else if (nextDesc.equals(STOP)) {
				student.stop();
			}
		}
	}

}
