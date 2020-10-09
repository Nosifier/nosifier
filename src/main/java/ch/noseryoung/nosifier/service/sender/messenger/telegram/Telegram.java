package ch.noseryoung.nosifier.service.sender.messenger.telegram;

import ch.noseryoung.nosifier.businessobject.notification.Notification;
import ch.noseryoung.nosifier.businessobject.notification.dto.NotificationDTO;
import ch.noseryoung.nosifier.service.sender.Channel;

public class Telegram implements Channel {

    @Override
    public void send(String receiverID, Notification notification) {

    }
}
