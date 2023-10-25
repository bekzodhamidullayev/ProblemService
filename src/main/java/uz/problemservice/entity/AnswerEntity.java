package uz.problemservice.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AnswerEntity extends BaseEntity{
    private String ownerEmail;
    private UUID problemId;
    private String answerText;
    private String answerPhoto;
}
