package dogshoppingmall.domain;

import dogshoppingmall.domain.*;
import dogshoppingmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String deliveryStatus;
    private Integer orderId;
}
