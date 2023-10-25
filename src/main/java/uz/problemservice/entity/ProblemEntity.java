package uz.problemservice.entity;


import com.sun.tools.javac.util.List;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "problem")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProblemEntity extends BaseEntity{
    private String ownerEmail;
    private List<TagEntity> tags;
    private Boolean isResolved;
}
