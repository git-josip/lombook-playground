package lombookplayground.example.withoutlombook;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.math.BigDecimal;
import java.util.List;

public class BookDetailItem_ImmutableWithBuilder {
	private final String name;
	private final String author;
	private final Integer numberOfPages;
	private final BigDecimal price;
	private final String description;
	private final List<String> readersComments;

	public BookDetailItem_ImmutableWithBuilder(String name, String author, Integer numberOfPages, BigDecimal price, String description, List<String> readersComments) {
		this.name = name;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.description = description;
		this.readersComments = readersComments;
	}

	public static BookDetailItem_ImmutableWithBuilder.Builder builder() {
		return new BookDetailItem_ImmutableWithBuilder.Builder();
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public List<String> getReadersComments() {
		return readersComments;
	}

	@Override
	public boolean equals(final Object object) {
		if (this == object) return true;
		if (object == null || this.getClass() != object.getClass()) return false;

		BookDetailItem_ImmutableWithBuilder otherBookDetailItem = (BookDetailItem_ImmutableWithBuilder)object;

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

	public BookDetailItem_ImmutableWithBuilder.Builder toBuilder() {
		return BookDetailItem_ImmutableWithBuilder.builder()
						.setName(this.getName())
						.setAuthor(this.getAuthor())
						.setDescription(this.getDescription())
						.setNumberOfPages(this.getNumberOfPages())
						.setPrice(this.getPrice())
						.setReadersComments(this.getReadersComments());
	}

	public static class Builder {
		private String name;
		private String author;
		private Integer numberOfPages;
		private BigDecimal price;
		private String description;
		private List<String> readersComments;


		public BookDetailItem_ImmutableWithBuilder.Builder setName(String name) {
			this.name = name;
			return this;
		}

		public BookDetailItem_ImmutableWithBuilder.Builder setAuthor(String author) {
			this.author = author;
			return this;
		}

		public BookDetailItem_ImmutableWithBuilder.Builder setNumberOfPages(Integer numberOfPages) {
			this.numberOfPages = numberOfPages;
			return this;
		}

		public BookDetailItem_ImmutableWithBuilder.Builder setPrice(BigDecimal price) {
			this.price = price;
			return this;
		}

		public BookDetailItem_ImmutableWithBuilder.Builder setDescription(String description) {
			this.description = description;
			return this;
		}

		public BookDetailItem_ImmutableWithBuilder.Builder setReadersComments(List<String> readersComments) {
			this.readersComments = readersComments;
			return this;
		}

		public BookDetailItem_ImmutableWithBuilder build() {
			return new BookDetailItem_ImmutableWithBuilder(
							this.name,
							this.author,
							this.numberOfPages,
							this.price,
							this.description,
							this.readersComments
			);
		}
	}
}
