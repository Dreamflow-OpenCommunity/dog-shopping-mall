package dogshoppingmall.domain;

import dogshoppingmall.domain.*;
import dogshoppingmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Integer productId;
    private Integer quantity;
}
