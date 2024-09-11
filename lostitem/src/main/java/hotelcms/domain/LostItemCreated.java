package hotelcms.domain;

import hotelcms.domain.*;
import hotelcms.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class LostItemCreated extends AbstractEvent {

    private Long lostItemId;
    private Long cleanTaskId;
    private Photo photo;
    private String location;

    public LostItemCreated(LostItem aggregate) {
        super(aggregate);
    }

    public LostItemCreated() {
        super();
    }
}
//>>> DDD / Domain Event
