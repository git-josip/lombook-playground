package lombookplayground.example.withoutlombook;

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
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof BookDetailItem)) return false;

		BookDetailItem that = (BookDetailItem) o;

		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (author != null ? !author.equals(that.author) : that.author != null) return false;
		if (numberOfPages != null ? !numberOfPages.equals(that.numberOfPages) : that.numberOfPages != null) return false;
		if (price != null ? !price.equals(that.price) : that.price != null) return false;
		if (description != null ? !description.equals(that.description) : that.description != null) return false;
		return readersComments != null ? readersComments.equals(that.readersComments) : that.readersComments == null;

	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (author != null ? author.hashCode() : 0);
		result = 31 * result + (numberOfPages != null ? numberOfPages.hashCode() : 0);
		result = 31 * result + (price != null ? price.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (readersComments != null ? readersComments.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "BookDetailItem{" +
						"name='" + name + '\'' +
						", author='" + author + '\'' +
						", numberOfPages=" + numberOfPages +
						", price=" + price +
						", description='" + description + '\'' +
						", readersComments=" + readersComments +
						'}';
	}

	public BookDetailItem.Builder toBuilder() {
		return BookDetailItem.Builder.builder()
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


		public BookDetailItem.Builder setName(String name) {
			this.name = name;
			return this;
		}

		public BookDetailItem.Builder setAuthor(String author) {
			this.author = author;
			return this;
		}

		public BookDetailItem.Builder setNumberOfPages(Integer numberOfPages) {
			this.numberOfPages = numberOfPages;
			return this;
		}

		public BookDetailItem.Builder setPrice(BigDecimal price) {
			this.price = price;
			return this;
		}

		public BookDetailItem.Builder setDescription(String description) {
			this.description = description;
			return this;
		}

		public BookDetailItem.Builder setReadersComments(List<String> readersComments) {
			this.readersComments = readersComments;
			return this;
		}

		public BookDetailItem build() {
			return new BookDetailItem(
							this.name,
							this.author,
							this.numberOfPages,
							this.price,
							this.description,
							this.readersComments
			);
		}

		public static BookDetailItem.Builder builder() {
			return new BookDetailItem.Builder();
		}
	}
}
