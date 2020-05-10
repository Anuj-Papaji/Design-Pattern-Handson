
public class BasicUser implements IUser {
	private IChatMediator chatMediator;
	private String name;

	public BasicUser(IChatMediator chatMediator, String name) {
		super();
		this.chatMediator = chatMediator;
		this.name = name;
		chatMediator.addUser(this);
	}

	@Override
	public void recieveMessage(String s) {
		System.out.println("User -> " + this + " -> Message ->" + s);

	}

	@Override
	public void sendMessage(String s) {
		chatMediator.sendMessage(s);
	}

	@Override
	public String toString() {
		return "BasicUser [name=" + name + "]";
	}

}
