package hotelcms.domain;

import hotelcms.ReservationApplication;
import hotelcms.domain.CleanReservationCreated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Reservation_table")
@Data
//<<< DDD / Aggregate Root
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cleanRsvId;

    private Long cleanTaskId;

    private String housekeeperName;

    @PostPersist
    public void onPostPersist() {
        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        hotelcms.external.Confirm confirm = new hotelcms.external.Confirm();
        // mappings goes here
        ReservationApplication.applicationContext
            .getBean(hotelcms.external.ConfirmService.class)
            .approveConfirm(confirm);

        CleanReservationCreated cleanReservationCreated = new CleanReservationCreated(
            this
        );
        cleanReservationCreated.publishAfterCommit();
    }

    public static ReservationRepository repository() {
        ReservationRepository reservationRepository = ReservationApplication.applicationContext.getBean(
            ReservationRepository.class
        );
        return reservationRepository;
    }

    //<<< Clean Arch / Port Method
    public static void confirm(ResrvationConfirmed resrvationConfirmed) {
        //implement business logic here:

        /** Example 1:  new item 
        Reservation reservation = new Reservation();
        repository().save(reservation);

        */

        /** Example 2:  finding and process
        
        repository().findById(resrvationConfirmed.get???()).ifPresent(reservation->{
            
            reservation // do something
            repository().save(reservation);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
