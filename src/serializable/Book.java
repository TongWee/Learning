package serializable;

import java.io.Serializable;

public class Book implements Serializable {
	private int id;
	private String name;
	private String author;

	public Book(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.author = builder.author;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getAuthor() {
		return this.author;
	}

	public static class Builder {
		private final int id;
		private String name;
		private String author;

		Builder(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public Builder author(String author) {
			this.author = author;
			return this;
		}

		public Book build() {
			return new Book(this);
		}
	}
}
