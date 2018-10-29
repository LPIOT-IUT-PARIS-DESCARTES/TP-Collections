package pobj.multiset.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pobj.multiset.HashMultiSet;
import pobj.multiset.MultiSet;

public class HashMultiSetTest {

	@Test
	public void testAdd() {
		MultiSet<String> m = new HashMultiSet<>();
		m.add("a");
		m.add("a",5);
		assertEquals(6, m.count("a"));
	}

}
