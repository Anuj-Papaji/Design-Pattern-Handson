
public class HR implements ILeaveRequestHandler {
	@SuppressWarnings("unused")
	private ILeaveRequestHandler nextHandler;

	public HR() {
		super();
	}

	public HR(ILeaveRequestHandler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		System.out.println("HR aproves leave for " + leaveRequest);
	}

}
