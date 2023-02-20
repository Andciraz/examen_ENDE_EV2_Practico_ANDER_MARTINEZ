package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosAmigosTest {

	@Test
	public void testAmigoMal() {
		NumerosAmigos n = new NumerosAmigos(45, 7);
		assertFalse(n.amigo());
	}
	
	@Test
	public void testAmigoPerfecto() {
		NumerosAmigos n = new NumerosAmigos(496, 496);
		assertTrue(n.amigo());
	}

	@Test
	public void testEsCeroN1() {
		NumerosAmigos n = new NumerosAmigos(0, 7);
		assertNull(n.esN1IgualAN2());
	}
	
	@Test
	public void testN1yN2SonIguales() {
		NumerosAmigos n = new NumerosAmigos(496, 496);
		assertTrue(n.esN1IgualAN2()==1);
	}
	
	@Test
	public void testN1yN2NoSonIguales() {
		NumerosAmigos n = new NumerosAmigos(496, 45);
		assertTrue(n.esN1IgualAN2()==0);
	}

}
