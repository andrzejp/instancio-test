package instanciotest;

import java.time.LocalDateTime;
import java.util.List;

public record ExampleObject(String aString, LocalDateTime aDateTime, Integer anInteger, List<Long> aListOfLongs) {
}
