package pregunta4;

public class SelfDestructingEZMessenger extends SelfDestructing {
    public SelfDestructingEZMessenger(Messaging messaging) {
		super(messaging);
		// TODO Auto-generated constructor stub
	}

	public void send(String message) {
        message = "☠" + message + "☠";
        messaging.send(message);
    }
}
