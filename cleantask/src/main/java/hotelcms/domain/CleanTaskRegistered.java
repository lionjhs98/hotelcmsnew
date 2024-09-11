package hotelcms.domain;

import hotelcms.domain.*;
import hotelcms.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CleanTaskRegistered extends AbstractEvent {

    private Long cleanTaskId;
    private String roomName;
    private Date date;
    private Integer hourlyRate;

    public CleanTaskRegistered(CleanTask aggregate) {
        super(aggregate);
    }

    public CleanTaskRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
