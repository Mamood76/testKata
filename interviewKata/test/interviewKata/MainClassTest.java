package interviewKata;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class MainClassTest {
	
	MainClass mainClass;

	@Test
	public void firstTest() {
	int actualValue = MainClass.first(List.of(2,5,3,8,9,2,4));
		
		assertEquals(2, actualValue);

	}

	
}
