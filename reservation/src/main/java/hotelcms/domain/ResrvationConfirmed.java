package hotelcms.domain;

import hotelcms.domain.*;
import hotelcms.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ResrvationConfirmed extends AbstractEvent {

    private Long id;
}
