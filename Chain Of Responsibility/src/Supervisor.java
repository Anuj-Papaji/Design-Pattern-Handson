
public class Supervisor implements ILeaveRequestHandler {
	private ILeaveRequestHandler nextHandler;

	public Supervisor() {
		super();
	}

	public Supervisor(ILeaveRequestHandler nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() <= 3)
			System.out.println("Supervisor aproves leave for " + leaveRequest);
		else
			nextHandler.handleRequest(leaveRequest);
	}

}
