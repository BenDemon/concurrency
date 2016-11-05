/*
	Sinlgeton2 class: create singleton at run time when needed
	key word : static, private constructor, volatile, synchronized, Singleton.class 
	static, private constructor : make sure there is only on instance of The Class.
	volatile :	mark read, write from/to main memory, guarentee visibility to all threads
	synchronized, Singleton.class : lock critical section
*/

class Singleton2 {
	private static volatile Singleton2 singleton;

	private Singleton2() { }
	
	public synchronized static Singleton2 getInstance() {
		//not lock when instance already been created, optimize read operation 
		if (singleton == null) {
			//lock when need to instantialize instance
			synchronized (Singleton2.class) {
				if (singleton == null) {
					singleton = new Singleton2();
				}
			}
		}
		return singleton;
	}
}