package project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import project1package.Calculator;

class Projecttest {

	@Test
	public void Projecttestsum() {
		assertEquals(30,Calculator.sum(10,20));
	}
	@Test
	public void Projecttestsub() {
		assertEquals(30,Calculator.sub(50,20));
	}
	@Test
	public void Projecttestmul() {
		assertEquals(30,Calculator.mul(6,5));
	}
	@Test
	public void Projecttestdiv() {
		assertEquals(6,Calculator.div(30,5));
	
	}
}

