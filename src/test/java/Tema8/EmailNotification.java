package Tema8;

public class EmailNotification extends Notification {

    private String emailAddress;


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override

    public void send() {
        System.out.println("Se trimite email catre " + emailAddress);
    }
}
