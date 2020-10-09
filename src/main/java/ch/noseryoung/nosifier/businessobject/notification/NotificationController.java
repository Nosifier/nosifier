package ch.noseryoung.nosifier.businessobject.notification;

import ch.noseryoung.nosifier.businessobject.notification.dto.NotificationDTO;
import ch.noseryoung.nosifier.businessobject.notification.dto.NotificationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notifications")
public class NotificationController {

    private final NotificationService notificationService;
    private final NotificationMapper notificationMapper;

    @Autowired
    public NotificationController(NotificationService notificationService, NotificationMapper notificationMapper) {
        this.notificationService = notificationService;
        this.notificationMapper = notificationMapper;
    }

    @PostMapping("/test")
    public ResponseEntity<Void> sendEmail(@RequestBody NotificationDTO notificationDTO) {
        notificationService.sendMail(notificationMapper.fromDTO(notificationDTO));
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
