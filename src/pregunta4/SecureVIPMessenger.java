package pregunta4;

public class SecureVIPMessenger extends Secure {
	
    public SecureVIPMessenger(Messaging messaging) {
		super(messaging);
	}

	public void send(String message) {
        message = encrypt(message);
        messaging.send(message);
    }
}
