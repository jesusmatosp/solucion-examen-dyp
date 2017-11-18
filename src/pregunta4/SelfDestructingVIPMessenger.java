package pregunta4;

public class SelfDestructingVIPMessenger extends SelfDestructing {
    public SelfDestructingVIPMessenger(Messaging messaging) {
		super(messaging);
		// TODO Auto-generated constructor stub
	}

	public void send(String message) {
        message = "☠" + message + "☠";
        messaging.send(message);
    }
}
