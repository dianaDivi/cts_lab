package main.Unit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTestCase {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Down");

	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp");

	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Tea Down");

	}

	@Test
	void testStudent() {
		String studentNume="Diana";
		
		int studentAgw=22;
		int grades[]= {9,5,6};
		Student student=new Student(studentNume, studentAgw, grades);
		assertEquals(studentNume, student.nume, "Name is not equals");
		assertEquals(studentAgw, student.varsta, "Age is not equals");
		assertEquals(grades, student.note, "Grades is not equals");


	}

}
