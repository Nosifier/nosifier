package ch.noseryoung.nosifier.service.sender;

import ch.noseryoung.nosifier.businessobject.notification.Notification;
import ch.noseryoung.nosifier.businessobject.notification.dto.NotificationDTO;

public interface Channel {

    void send(String receiverID, Notification notification);
}
