package task;

import lombok.*;

//@Getter
//@Setter
//@ToString
@Data
//@AllArgsConstructor
@Builder
public class Orange {

    private int weight;
    private Color color;
}

// Builder generates an @AllArgConstructor unless there is another @XConstructor

