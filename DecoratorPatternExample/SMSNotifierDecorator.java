public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);   // first do whatever the wrapped notifier does
        sendSMS(message);      // then add the new behavior
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}