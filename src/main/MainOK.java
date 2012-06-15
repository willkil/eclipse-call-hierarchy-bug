package main;

import impl.Impl2;
import util.Static;
import api.PublicInterface2;

public class MainOK {

	public static void main(String[] args) {
		PublicInterface2 impl2 = Impl2.builder()
			.setName("Name OK")
		.build();
		String name = impl2.getName();
		Static.printIt(name);
	}

}
