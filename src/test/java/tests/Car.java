package tests;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter             //
@Setter             //
@EqualsAndHashCode  // можно заменить одним @Data
@ToString           //
@Builder
public class Car {
    private String make;
    private String model;
    private int speed;
}
