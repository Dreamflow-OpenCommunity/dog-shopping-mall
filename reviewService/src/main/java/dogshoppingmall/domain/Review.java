package dogshoppingmall.domain;

import dogshoppingmall.ReviewServiceApplication;
import dogshoppingmall.domain.ReviewCreated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Review_table")
@Data
//<<< DDD / Aggregate Root
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer orderId;

    private Integer productId;

    private String reivewContent;

    private Long score;

    @PostPersist
    public void onPostPersist() {
        ReviewCreated reviewCreated = new ReviewCreated(this);
        reviewCreated.publishAfterCommit();
    }

    public static ReviewRepository repository() {
        ReviewRepository reviewRepository = ReviewServiceApplication.applicationContext.getBean(
            ReviewRepository.class
        );
        return reviewRepository;
    }

    //<<< Clean Arch / Port Method
    public static void addReviewList(OrderConfirmed orderConfirmed) {
        //implement business logic here:

        /** Example 1:  new item 
        Review review = new Review();
        repository().save(review);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderConfirmed.get???()).ifPresent(review->{
            
            review // do something
            repository().save(review);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
