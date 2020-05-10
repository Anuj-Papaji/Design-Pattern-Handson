
public class Client {

	public static void main(String[] args) {
		IChatMediator chatMediator = new ChatMediator();
		IUser user1 = new BasicUser(chatMediator, "user1");
		IUser user2 = new BasicUser(chatMediator, "user2");
		IUser user3 = new PremiumUser(chatMediator, "user3");
		IUser user4 = new PremiumUser(chatMediator, "user4");
		System.out.println("------User1 Broadcast--------");
		user1.sendMessage("This is user1");
		System.out.println("------User2 Broadcast--------");
		user2.sendMessage("This is user2");
		System.out.println("------User3 Broadcast--------");
		user3.sendMessage("This is user3");
		System.out.println("------User4 Broadcast--------");
		user4.sendMessage("This is user4");
	}

}
