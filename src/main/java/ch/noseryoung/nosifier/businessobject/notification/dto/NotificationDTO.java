package ch.noseryoung.nosifier.businessobject.notification.dto;

public class NotificationDTO {

    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public NotificationDTO setContent(String content) {
        this.content = content;
        return this;
    }

    public NotificationDTO setTitle(String title) {
        this.title = title;
        return this;
    }
}
