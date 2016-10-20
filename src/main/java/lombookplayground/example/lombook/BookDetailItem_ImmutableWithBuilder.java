package lombookplayground.example.lombook;


import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class BookDetailItem_ImmutableWithBuilder {
	private final String name;
	private final String author;
	private final Integer numberOfPages;
	private final BigDecimal price;
	private final String description;
	private final List<String> readersComments;
}
