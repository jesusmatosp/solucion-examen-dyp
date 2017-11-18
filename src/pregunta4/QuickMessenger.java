package pregunta4;

public class QuickMessenger implements Messaging {
	
	
	
	public QuickMessenger() {
		// TODO Auto-generated constructor stub
	}
	
    @Override
    public void send(String message) {
        System.out.println("Message '" + message + "' sent via e-mail");
    }
}
