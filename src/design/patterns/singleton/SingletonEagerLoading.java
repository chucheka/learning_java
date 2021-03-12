package design.patterns.singleton;

//Static initializer based Java implementation of
//singleton design pattern
class SingletonEagerLoading
{
	private static SingletonEagerLoading obj = new SingletonEagerLoading();

	private SingletonEagerLoading() {}

	public static SingletonEagerLoading getInstance()
	{
		return obj;
	}
}

//This is Thread Safe as the an instance is only created once the class is loaded then
// for any other call to the getInstance method the already created instance is returned 