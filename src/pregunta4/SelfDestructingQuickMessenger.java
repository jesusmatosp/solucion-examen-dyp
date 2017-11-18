package pregunta4;

public class SelfDestructingQuickMessenger extends SelfDestructing {
	
    public SelfDestructingQuickMessenger(Messaging messaging) {
		super(messaging);
		// TODO Auto-generated constructor stub
	}

	public void send(String message) {
        message = "☠" + message + "☠";
        messaging.send(message);
    }
}
