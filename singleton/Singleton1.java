/*
	Sinlgeton1 class: create singleton at compile time
	good :  easy, thread safe, no need to use synchroized 
	bad: less performance, constructor cost lots of time and you never use it 
*/

class Singleton1 {
	private static final Singleton1 singleton = new Sinleton1();

	private Singleton1() { }
	public static Singleton1 getInstance() {
		return singleton;
	}
}