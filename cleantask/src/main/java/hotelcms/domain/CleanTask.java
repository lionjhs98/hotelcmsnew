package hotelcms.domain;

import hotelcms.CleantaskApplication;
import hotelcms.domain.CleanTaskDeleted;
import hotelcms.domain.CleanTaskModified;
import hotelcms.domain.CleanTaskRegistered;
import hotelcms.domain.CleanTaskReserved;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "CleanTask_table")
@Data
//<<< DDD / Aggregate Root
public class CleanTask {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cleanTaskId;

    private String roomName;

    private String status;

    private Date date;

    private Integer hourlyRate;

    private Boolean lostItemAdded;

    @PostPersist
    public void onPostPersist() {
        CleanTaskRegistered cleanTaskRegistered = new CleanTaskRegistered(this);
        cleanTaskRegistered.publishAfterCommit();

        CleanTaskModified cleanTaskModified = new CleanTaskModified(this);
        cleanTaskModified.publishAfterCommit();

        CleanTaskDeleted cleanTaskDeleted = new CleanTaskDeleted(this);
        cleanTaskDeleted.publishAfterCommit();

        CleanTaskReserved cleanTaskReserved = new CleanTaskReserved(this);
        cleanTaskReserved.publishAfterCommit();
    }

    public static CleanTaskRepository repository() {
        CleanTaskRepository cleanTaskRepository = CleantaskApplication.applicationContext.getBean(
            CleanTaskRepository.class
        );
        return cleanTaskRepository;
    }

    //<<< Clean Arch / Port Method
    public static void updateLostItemAdded(LostItemCreated lostItemCreated) {
        //implement business logic here:

        /** Example 1:  new item 
        CleanTask cleanTask = new CleanTask();
        repository().save(cleanTask);

        */

        /** Example 2:  finding and process
        
        repository().findById(lostItemCreated.get???()).ifPresent(cleanTask->{
            
            cleanTask // do something
            repository().save(cleanTask);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
