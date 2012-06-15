package main;

public interface PublicInterface1 extends
	PackageInterface1Getters
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
