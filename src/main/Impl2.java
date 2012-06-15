package main;

public class Impl2 implements PublicInterface2 {
	private final String name;

	private Impl2(Builder builder) {
		this.name = builder.name;
	}

	public String getName() {
		return name;
	}

	public static PublicInterface2Builder builder() {
		return new Builder();
	}

	private static class Builder implements PublicInterface2Builder {
		private String name = "Impl2 name";

		private Builder() {}

		public String getName() {
			return name;
		}

		public PublicInterface2Builder setName(String name) {
			this.name = name;
			return this;
		}

		public PublicInterface2 build() {
			return new Impl2(this);
		}

	}

}
