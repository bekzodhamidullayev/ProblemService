package uz.problemservice.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "tag")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TagEntity extends BaseEntity {
    private String tag;
}
