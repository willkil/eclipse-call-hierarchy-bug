package main;

public class MainOK {

	public static void main(String[] args) {
		PublicInterface2 impl2 = new Impl2("Name OK");
		String name = impl2.getName();
		Static.printIt(name);
	}

}
