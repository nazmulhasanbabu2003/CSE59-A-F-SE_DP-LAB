interface MessageSender {
    void sendMessage(String message);
}

class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class NotificationService {
    private MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void alertUser(String msg) {
        sender.sendMessage(msg);
    }
}

public class task2 {
    public static void main(String[] args) {

        MessageSender email = new EmailSender();
        NotificationService service1 = new NotificationService(email);
        service1.alertUser("Your account has been created.");

        MessageSender sms = new SMSSender();
        NotificationService service2 = new NotificationService(sms);
        service2.alertUser("Your OTP is 123456.");
    }
}
