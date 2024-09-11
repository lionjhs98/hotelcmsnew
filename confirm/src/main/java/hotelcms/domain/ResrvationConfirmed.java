package hotelcms.domain;

import hotelcms.domain.*;
import hotelcms.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ResrvationConfirmed extends AbstractEvent {

    private Long id;

    public ResrvationConfirmed(Confirm aggregate) {
        super(aggregate);
    }

    public ResrvationConfirmed() {
        super();
    }
}
//>>> DDD / Domain Event
