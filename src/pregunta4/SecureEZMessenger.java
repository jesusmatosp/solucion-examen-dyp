package pregunta4;

public class SecureEZMessenger extends Secure {
    
    public SecureEZMessenger(Messaging messaging) {
		super(messaging);
	}

	public void send(String message) {
        message = encrypt(message);
        messaging.send(message);
    }
}
