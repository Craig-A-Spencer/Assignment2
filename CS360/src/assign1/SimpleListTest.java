package assign1;

/* Name: Craig Spencer
 * Class ID: 126
 * Assignment: 1
 * Description:
 * This JUnit test file will test the methods described in SimpleList.Java.
 * Each test runs as independent from the others as possible as to be able
 * to pinpoint exactly where errors occur.
*/

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {

	@Test
	public void testSimpleList() {
		SimpleList list = new SimpleList();
		assertEquals(list.count(), 0);
	}
	
	@Test
	public void testSimpleListFail() {
		SimpleList list = new SimpleList();
		assertNotNull(list);
	}
	
	@Test
	public void testAdd() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		int[] array = list.getArr();
		assertEquals(array[2], 1);
	}
	
	@Test
	public void testAddFail() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		int[] array = list.getArr();
		assertNotEquals(array[1], 0);
	}
	
	@Test
	public void testRemove() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove(2);
		int[] array = list.getArr();
		assertEquals(array[2], 0);
	}
	
	@Test
	public void testRemoveFail() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove(2);
		int[] array = list.getArr();
		assertNotEquals(array[1], 0);
	}
	
	@Test
	public void testCount() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		assertEquals(list.count(), 2);
	}
	
	@Test
	public void testCountFail() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		assertNotEquals(list.count(), 0);
	}
	
	@Test
	public void testToString() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		String str = list.toString();
		assertTrue(str, str.equals("3 2 1"));
	}
	
	@Test
	public void testToStringFail() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		String str = list.toString();
		assertFalse(str.equals(""));
	}
	
	@Test
	public void testSearch() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals(list.search(2), 1);
	}
	
	@Test
	public void testSearchFail() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.add(3);
		assertNotEquals(list.search(1), -1);

	}
}
