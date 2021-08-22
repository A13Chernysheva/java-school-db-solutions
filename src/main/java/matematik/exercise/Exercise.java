package matematik.exercise;

import lombok.*;
import matematik.Operation;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Exercise {
    private int a;
    private int b;
    private int answer;
    private Operation operation;
}
