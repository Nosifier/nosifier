package ch.noseryoung.nosifier.businessobject.notification;


public class Notification {
    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Notification setContent(String content) {
        this.content = content;
        return this;
    }

    public Notification setTitle(String title) {
        this.title = title;
        return this;
    }
}
