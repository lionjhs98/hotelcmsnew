package hotelcms.domain;

import hotelcms.domain.*;
import hotelcms.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CleanTaskReserved extends AbstractEvent {

    private Long id;

    public CleanTaskReserved(CleanTask aggregate) {
        super(aggregate);
    }

    public CleanTaskReserved() {
        super();
    }
}
//>>> DDD / Domain Event
