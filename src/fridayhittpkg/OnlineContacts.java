/**
 * 
 */
package fridayhittpkg;

/**
 * 
 */
public class OnlineContacts {
	public static int noOfOnlineContacts = 0;
	public static int noOfContacts = 10;
	
	public static int getNoOfOnlineContacts() {
		return noOfOnlineContacts;
	}
	
	public static void setNoOfOnlineContacts(int noOfOnlineContacts) {
		if (noOfOnlineContacts < 0) {
			OnlineContacts.noOfOnlineContacts = 0;
		} else if (noOfOnlineContacts > OnlineContacts.noOfContacts){
			OnlineContacts.noOfOnlineContacts = OnlineContacts.noOfContacts;
		} else {
			OnlineContacts.noOfOnlineContacts = noOfOnlineContacts;
		}
	}
}
