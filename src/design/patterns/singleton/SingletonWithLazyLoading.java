package design.patterns.singleton;

//Classical Java implementation of singleton 
//design pattern
class SingletonWithLazyLoading
{
	private static SingletonWithLazyLoading obj;

	// private constructor to force use of
	// getInstance() to create Singleton object
	private SingletonWithLazyLoading() {}

	public static SingletonWithLazyLoading getInstance()
	{
		if (obj==null)
			obj = new SingletonWithLazyLoading();
		return obj;
	}
}
