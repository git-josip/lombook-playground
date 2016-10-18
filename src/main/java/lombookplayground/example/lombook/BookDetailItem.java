package lombookplayground.example.lombook;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class BookDetailItem {
	private String name;
	private String author;
	private Integer numberOfPages;
	private BigDecimal price;
	private String description;
	private List<String> readersComments;
}
