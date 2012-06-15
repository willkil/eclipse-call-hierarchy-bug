package main;

import main.PublicInterface2.PublicInterface2Builder;

public interface PublicInterface2 extends
	PackageInterface2Getters,
	Copyable<PublicInterface2, PublicInterface2Builder>
{

	public interface PublicInterface2Builder extends
		PackageInterface2Getters,
		Builder<PublicInterface2>
	{
		PublicInterface2Builder setName(String name);
	}

}

/*package*/ interface PackageInterface2Getters extends
	PackageInterface1Getters
{

}
