package main;

public class Main {

	public static void main(String[] args) {
		broken();
		ok();
	}

	private static void broken() {
		PublicInterface2 impl2 = Impl2.builder()
			.setName("Name Broken")
		.build();
		Static.printIt(impl2.getName());
	}

	private static void ok() {
		PublicInterface2 impl2 = Impl2.builder()
			.setName("Name OK")
		.build();
		String name = impl2.getName();
		Static.printIt(name);
	}

}
