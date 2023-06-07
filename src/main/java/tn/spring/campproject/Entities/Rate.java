package tn.spring.campproject.Entities;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.spring.campproject.Entities.Activités;
import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdRate;

    int Score;

    Date DateRating;

    @ManyToOne
    Activités Activite;
}




