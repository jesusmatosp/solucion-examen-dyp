package pregunta4;

public abstract class SelfDestructing {

	protected Messaging messaging;
	
	public SelfDestructing(Messaging messaging){
		this.messaging = messaging;
	}
	
    public void send(String message) {
        message = "☠" + message + "☠";
    }
    
}
