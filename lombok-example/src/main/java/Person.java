import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    private String name;
    private int age;
    private String email;
}
