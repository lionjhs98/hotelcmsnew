package hotelcms.infra;

import hotelcms.config.kafka.KafkaProcessor;
import hotelcms.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class CleanTaskManagementViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private CleanTaskManagementRepository cleanTaskManagementRepository;
    //>>> DDD / CQRS
}
