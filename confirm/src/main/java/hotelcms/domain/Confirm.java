package hotelcms.domain;

import hotelcms.ConfirmApplication;
import hotelcms.domain.ResrvationConfirmed;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Confirm_table")
@Data
//<<< DDD / Aggregate Root
public class Confirm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        ResrvationConfirmed resrvationConfirmed = new ResrvationConfirmed(this);
        resrvationConfirmed.publishAfterCommit();
    }

    public static ConfirmRepository repository() {
        ConfirmRepository confirmRepository = ConfirmApplication.applicationContext.getBean(
            ConfirmRepository.class
        );
        return confirmRepository;
    }
}
//>>> DDD / Aggregate Root
