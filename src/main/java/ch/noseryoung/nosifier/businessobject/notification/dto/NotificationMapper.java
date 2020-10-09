package ch.noseryoung.nosifier.businessobject.notification.dto;

import ch.noseryoung.nosifier.businessobject.ExtendedDTOMapper;
import ch.noseryoung.nosifier.businessobject.notification.Notification;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NotificationMapper extends ExtendedDTOMapper<Notification, NotificationDTO>{
}
