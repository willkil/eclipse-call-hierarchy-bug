package main;

public class MainBroken {

	public static void main(String[] args) {
		PublicInterface2 impl2 = new Impl2("Name Broken");
		Static.printIt(impl2.getName());
	}

}
