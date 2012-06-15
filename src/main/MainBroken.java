package main;

import impl.Impl2;
import util.Static;
import api.PublicInterface2;

public class MainBroken {

	public static void main(String[] args) {
		PublicInterface2 impl2 = Impl2.builder()
			.setName("Name Broken")
		.build();
		Static.printIt(impl2.getName());
	}

}
