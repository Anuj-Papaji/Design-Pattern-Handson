import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

	private List<IUser> users;

	public ChatMediator() {
		super();
		users = new ArrayList<>();
	}

	@Override
	public void addUser(IUser user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String s) {
		users.forEach((user)->user.recieveMessage(s));
	}

}
