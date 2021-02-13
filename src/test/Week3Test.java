package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import week3.Instructor;
import week3.Student;

class Week3Test {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@BeforeEach
	public void setUp() throws Exception {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@AfterEach
	public void tearDown() throws Exception {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	@Test
	void test() throws IOException {
		Student student = new Student("John");     // Receiver
		Instructor instructor = new Instructor();  // Invoker
		
		instructor.instructEnter(student);         // Binding and Execution
		assertEquals("John entered in the car." + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
		instructor.instructLeave(student);
		assertEquals("John left the car." + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
		// put John inside the car again by undoing last operation
		instructor.instructUndo(student);
		assertEquals("John entered in the car." + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
		instructor.instructStart(student);
		assertEquals("John started the car." + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
		instructor.instructStop(student);
		assertEquals("John stopped the car." + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
		// make John starting the car again by undoing last operation
		instructor.instructUndo(student);
		assertEquals("John started the car." + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
		// make John stopping the car by redoing last undone operation 
		instructor.instructRedo(student);
		assertEquals("John stopped the car." + System.lineSeparator(), outContent.toString());
		outContent.reset();
		
	}

}
