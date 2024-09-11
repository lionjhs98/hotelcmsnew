package hotelcms.domain;

import hotelcms.domain.*;
import hotelcms.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class LostItemCreated extends AbstractEvent {

    private Long lostItemId;
    private Long cleanTaskId;
    private Object photo;
    private String location;
}
