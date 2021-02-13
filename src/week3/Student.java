package week3;

/**
 * A class representing a student in a car driving classes.
 * 
 * @author Ramadevi
 *
 */
public class Student {

	private String name;

	/**
	 * Create a student object.
	 * 
	 * @param name Name of the student
	 */
	public Student(String name) {
		this.name = name;
	}

	/**
	 * Returns student's name
	 * 
	 * @return student's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets student's name
	 * 
	 * @param name student's name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Acts on "enter" command.
	 */
	public void enter() {
		System.out.println(name + " entered in the car.");
	}

	/**
	 * Acts on "leave" command.
	 */
	public void leave() {
		System.out.println(name + " left the car.");
	}

	/**
	 * Acts on "start" command.
	 */
	public void start() {
		System.out.println(name + " started the car.");
	}

	/**
	 * Acts on "stop" command.
	 */
	public void stop() {
		System.out.println(name + " stopped the car.");
	}

}
