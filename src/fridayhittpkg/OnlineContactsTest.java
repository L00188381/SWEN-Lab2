/**
 * 
 */
package fridayhittpkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

/**
 * 
 */
@TestMethodOrder(OrderAnnotation.class)
class OnlineContactsTest {

	/**
	 * Test method for {@link fridayhittpkg.OnlineContacts#getNoOfOnlineContacts()}.
	 */
	@Test
	@Order(1)
	void testGetNoOfOnlineContacts() {
		int onlineContacts = OnlineContacts.getNoOfOnlineContacts();
		assertEquals(0, onlineContacts);
	}

	/**
	 * Test method for {@link fridayhittpkg.OnlineContacts#setNoOfOnlineContacts(int)}.
	 */
	@Test
	void testSetNoOfOnlineContacts() {
		OnlineContacts.setNoOfOnlineContacts(5);
		int onlineContacts = OnlineContacts.getNoOfOnlineContacts();
		assertEquals(5, onlineContacts);
	}

	/**
	 * Test method for {@link fridayhittpkg.OnlineContacts#setNoOfOnlineContacts(int)}.
	 */
	@Test
	void testSetMinimumNoOfOnlineContacts() {
		OnlineContacts.setNoOfOnlineContacts(0);
		int onlineContacts = OnlineContacts.getNoOfOnlineContacts();
		assertEquals(0, onlineContacts);
	}
	
	/**
	 * Test method for {@link fridayhittpkg.OnlineContacts#setNoOfOnlineContacts(int)}.
	 */
	@Test
	void testSetMaximumNoOfOnlineContacts() {
		OnlineContacts.setNoOfOnlineContacts(10);
		int onlineContacts = OnlineContacts.getNoOfOnlineContacts();
		assertEquals(10, onlineContacts);
	}
	
	/**
	 * Test method for {@link fridayhittpkg.OnlineContacts#setNoOfOnlineContacts(int)}.
	 */
	@Test
	void testSetNegativeNoOfOnlineContacts() {
		OnlineContacts.setNoOfOnlineContacts(-5);
		int onlineContacts = OnlineContacts.getNoOfOnlineContacts();
		assertEquals(0, onlineContacts);
	}
	
	/**
	 * Test method for {@link fridayhittpkg.OnlineContacts#setNoOfOnlineContacts(int)}.
	 */
	@Test
	void testSetMaxNoOfOnlineContacts() {
		OnlineContacts.setNoOfOnlineContacts(20);
		int onlineContacts = OnlineContacts.getNoOfOnlineContacts();
		assertEquals(10, onlineContacts);
	}
}
