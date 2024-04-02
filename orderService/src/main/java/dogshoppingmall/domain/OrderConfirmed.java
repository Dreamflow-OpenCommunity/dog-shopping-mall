package dogshoppingmall.domain;

import dogshoppingmall.domain.*;
import dogshoppingmall.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderConfirmed extends AbstractEvent {

    private Long id;
    private Integer productId;
    private Integer quantity;
    private String orderStatus;
    private String deliveryStatus;

    public OrderConfirmed(Order aggregate) {
        super(aggregate);
    }

    public OrderConfirmed() {
        super();
    }
}
//>>> DDD / Domain Event
