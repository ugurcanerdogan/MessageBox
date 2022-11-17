package entities;

//Message entity class
public class Message {

    private String message_id;
    private String content;
    private String password;
    private User receiver;

    public Message() {
    }

    public Message(String message_id, String content, String password, User receiver) {
        this.message_id = message_id;
        this.content = content;
        this.password = password;
        this.receiver = receiver;
    }

    public String getMessage_id() {
        return message_id;
    }

    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

}
