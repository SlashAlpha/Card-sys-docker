package slash.code.matchanalysis.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter

@AllArgsConstructor
@Builder
public class Card {

    UUID id;
    String color;
    Integer value;
    Integer faceVal;
    String description;
    Integer number;

    @Override
    public String toString() {
        if (!description.equals("")) {
            return description + " of " + color + " card number : " + number;
        } else {
            return value + " of " + color + " card number : " + number;
        }
    }

}
