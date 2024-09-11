package hotelcms.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import hotelcms.config.kafka.KafkaProcessor;
import hotelcms.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    CleanTaskRepository cleanTaskRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LostItemCreated'"
    )
    public void wheneverLostItemCreated_UpdateLostItemAdded(
        @Payload LostItemCreated lostItemCreated
    ) {
        LostItemCreated event = lostItemCreated;
        System.out.println(
            "\n\n##### listener UpdateLostItemAdded : " +
            lostItemCreated +
            "\n\n"
        );

        // Sample Logic //
        CleanTask.updateLostItemAdded(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
