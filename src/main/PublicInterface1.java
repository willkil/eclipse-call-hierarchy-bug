package main;

import main.PublicInterface1.PublicInterface1Builder;

public interface PublicInterface1 extends
	PackageInterface1Getters,
	Copyable<PublicInterface1, PublicInterface1Builder>
{

	public interface PublicInterface1Builder extends
		PackageInterface1Getters,
		Builder<PublicInterface1>
	{
		PublicInterface1Builder setName(String name);
	}

}

/*package*/ interface PackageInterface1Getters {
	String getName();
}
