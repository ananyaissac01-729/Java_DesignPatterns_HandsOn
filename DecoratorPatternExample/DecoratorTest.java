public class DecoratorTest {
    public static void main(String[] args) {
        // Just email
        Notifier basic = new EmailNotifier();
        System.out.println("--- Basic ---");
        basic.send("Server is down!");

        // Email + SMS
        Notifier emailAndSms = new SMSNotifierDecorator(new EmailNotifier());
        System.out.println("--- Email + SMS ---");
        emailAndSms.send("Server is down!");

        // Email + SMS + Slack (stacking all three)
        Notifier all = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        System.out.println("--- Email + SMS + Slack ---");
        all.send("Server is down!");
    }
}