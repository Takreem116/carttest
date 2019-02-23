/**
 * 
 */
package test;

import static org.junit.Assert.*;
import org.junit.Test;

import roaahw1.Cart;
import roaahw1.Pro;



public class roaahw1test {

	@Test
	public void test1() {
		Cart c = new Cart ();
		assertEquals(0,c.getCou());
	}

	@Test
	public void test2() {
		Cart c = new Cart ();
		Pro p = new Pro("web",1,127);
		c.add(p);
		assertEquals(1,c.getCou());
	}
	@Test
	public void test3() {
		Cart c = new Cart ();
		Pro p = new Pro("web",1,127);
		Pro P= new Pro("java",1,100);
		c.add(p);
		c.add(P);
		assertEquals(2,c.getCou());
		assertEquals(227,c.getPri());
	}
	

}
