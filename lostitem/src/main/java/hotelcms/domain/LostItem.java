package hotelcms.domain;

import hotelcms.LostitemApplication;
import hotelcms.domain.LostItemCreated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "LostItem_table")
@Data
//<<< DDD / Aggregate Root
public class LostItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lostItemId;

    private Long cleanTaskId;

    @Embedded
    private Photo photo;

    private String location;

    @PostPersist
    public void onPostPersist() {
        LostItemCreated lostItemCreated = new LostItemCreated(this);
        lostItemCreated.publishAfterCommit();
    }

    public static LostItemRepository repository() {
        LostItemRepository lostItemRepository = LostitemApplication.applicationContext.getBean(
            LostItemRepository.class
        );
        return lostItemRepository;
    }
}
//>>> DDD / Aggregate Root
