package main;

public interface PublicInterface2 extends
	PackageInterface2Getters
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
