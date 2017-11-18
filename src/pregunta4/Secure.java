package pregunta4;

public abstract class Secure {

	protected Messaging messaging;
	
	public Secure(Messaging messaging){
		this.messaging = messaging;
	}
	
	protected String encrypt(String message) {
        message = message.substring(message.length() - 1) + message.substring(0, message.length() - 1);
        return message;
    }
    
   public abstract void send(String message);
   
}
