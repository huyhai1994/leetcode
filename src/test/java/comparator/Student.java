package comparator;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode
public class Student {
    private String name;
    private int age;
    private double score;
}
