package lombookplayground.example.lombook;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Data
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
