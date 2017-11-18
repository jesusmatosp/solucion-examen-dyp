package pregunta4;

public class SecureQuickMessenger extends Secure {
	
    public SecureQuickMessenger(Messaging messaging) {
		super(messaging);
	}

	public void send(String message) {
        message = this.encrypt(message);
        messaging.send(message);
    }
}
