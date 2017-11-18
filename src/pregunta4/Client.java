package pregunta4;

public class Client {

    public static void main(String[] args) {
        String message = "Hello";
        
        QuickMessenger quickMessenger = new QuickMessenger();
        quickMessenger.send(message);
        
        SecureQuickMessenger secureQuickMessenger = new SecureQuickMessenger(new QuickMessenger());
        secureQuickMessenger.send(message);
        
        SelfDestructingQuickMessenger selfDestructingQuickMessenger = new SelfDestructingQuickMessenger(new QuickMessenger());
        selfDestructingQuickMessenger.send(message);
        
        VIPMessenger vipMessenger = new VIPMessenger();
        vipMessenger.send(message);
        
        SecureVIPMessenger secureVIPMessenger = new SecureVIPMessenger(new VIPMessenger());
        secureVIPMessenger.send(message);
        
        SelfDestructingVIPMessenger selfDestructingVIPMessenger = new SelfDestructingVIPMessenger(new VIPMessenger());
        selfDestructingVIPMessenger.send(message);
        
        EZMessenger ezMessenger = new EZMessenger();
        ezMessenger.send(message);
        
        SecureEZMessenger secureEZMessenger = new SecureEZMessenger(new EZMessenger());
        secureEZMessenger.send(message);
        
        SelfDestructingEZMessenger selfDestructingEZMessenger = new SelfDestructingEZMessenger(new EZMessenger());
        selfDestructingEZMessenger.send(message);
    }
}
