package hotelcms.domain;

import hotelcms.domain.*;
import hotelcms.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CleanReservationCreated extends AbstractEvent {

    private Long cleanRsvId;
    private Long cleanTaskId;
    private String housekeeperName;

    public CleanReservationCreated(Reservation aggregate) {
        super(aggregate);
    }

    public CleanReservationCreated() {
        super();
    }
}
//>>> DDD / Domain Event
