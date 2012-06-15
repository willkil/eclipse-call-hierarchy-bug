package main;

public class Impl2 implements PublicInterface2 {
	private final String name;

	public Impl2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
