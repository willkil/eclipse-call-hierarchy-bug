package main;

public class Main {

	public static void main(String[] args) {
		broken();
		ok();
	}

	private static void broken() {
		PublicInterface2 impl2 = new Impl2("Name Broken");
		Static.printIt(impl2.getName());
	}

	private static void ok() {
		PublicInterface2 impl2 = new Impl2("Name OK");
		String name = impl2.getName();
		Static.printIt(name);
	}

}
