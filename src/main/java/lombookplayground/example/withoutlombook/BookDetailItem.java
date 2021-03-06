package lombookplayground.example.withoutlombook;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.math.BigDecimal;
import java.util.List;

public class BookDetailItem {
	private String name;
	private String author;
	private Integer numberOfPages;
	private BigDecimal price;
	private String description;
	private List<String> readersComments;

	public BookDetailItem(String name, String author, Integer numberOfPages, BigDecimal price, String description, List<String> readersComments) {
		this.name = name;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.description = description;
		this.readersComments = readersComments;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}

	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getPrice() {
		return price;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}

	public void setReadersComments(List<String> readersComments) {
		this.readersComments = readersComments;
	}
	public List<String> getReadersComments() {
		return readersComments;
	}

	@Override
	public boolean equals(final Object object) {
		if (this == object) return true;
		if (object == null || this.getClass() != object.getClass()) return false;

		BookDetailItem otherBookDetailItem = (BookDetailItem)object;

		return Objects.equal(name, otherBookDetailItem.name)
						&& Objects.equal(author, otherBookDetailItem.author)
						&& Objects.equal(numberOfPages, otherBookDetailItem.numberOfPages)
						&& Objects.equal(price, otherBookDetailItem.price)
						&& Objects.equal(description, otherBookDetailItem.description)
						&& Objects.equal(readersComments, otherBookDetailItem.readersComments);
	}
	@Override
	public int hashCode() {
		return Objects.hashCode(
						name,
						author,
						numberOfPages,
						price,
						description,
						readersComments
		);
	}
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
						.add("name", name)
						.add("author", author)
						.add("numberOfPages", numberOfPages)
						.add("price", price)
						.add("description", description)
						.add("readersComments", readersComments)
						.toString();
	}
}
