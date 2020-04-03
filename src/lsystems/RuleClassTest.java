package lsystems;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class RuleClassTest {
	
	
	
	@Test
	public void testA_A() {
	LRule a_A = new A_A();
	char[] a = new char[] {'A'};
	assertEquals('A', a_A.getMatch());
	assertEquals(a, a_A.getBody());
	
	
	}

	@Test
	public void testA_AA() {
	LRule a_AA = new A_AA();
	char[] a = new char[] {'A', 'A'};
	assertEquals('A', a_AA.getMatch());
	assertEquals(a, a_AA.getBody());
	
	
	}

	@Test
	public void testA_BC() {
	LRule a_BC = new A_BC();
	char[] a = new char[] {'B', 'C'};
	assertEquals('A', a_BC.getMatch());
	assertEquals(a, a_BC.getBody());
	
	
	}

	@Test
	public void testA_Q() {
	LRule a_Q = new A_Q();
	char[] a = new char[] {'Q'};
	assertEquals('A', a_Q.getMatch());
	assertEquals(a, a_Q.getBody());
	
	
	}

	@Test
	public void testA_X() {
	LRule a_X = new A_X();
	char[] a = new char[] {' '};
	assertEquals('A', a_X.getMatch());
	assertEquals(a, a_X.getBody());
	
	
	}


	@Test
	public void testB_A() {
	LRule b_A = new B_A();
	char[] a = new char[] {'A'};
	assertEquals('B', b_A.getMatch());
	assertEquals(a, b_A.getBody());
	
	}

	@Test
	public void testC_B() {
	LRule c_B = new C_B();
	char[] a = new char[] {'B'};
	assertEquals('C', c_B.getMatch());
	assertEquals(a, c_B.getBody());
	
	
	}
}
