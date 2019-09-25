package clone;

public class HelloWorld {
//	//static修饰的变量称为静态变量
//	static String name="hahah";
//	
//	
//	public static void main(String[] args) {
//		System.out.println("名称为"+HelloWorld.name);
//		HelloWorld hw=new HelloWorld();
//		hw.name="heheh";
//		System.out.println(name);
//	}
	//static修饰的方法称为静态方法
	String name="hehe";
	static String username="hahah";
	public static void A(){
		System.out.println("hahha");
		System.out.println(username);
		//  静态方法中可以直接调用同类中的静态成员，但不能直接调用非静态成员
		//System.out.println(name);//错误的
		HelloWorld hw=new HelloWorld();
		System.out.println(hw.name);
	}
	public void B(){
		System.out.println(username);
	}
	
	{
		name="gaga";
		//username="hehe";
		System.out.println(name);
		//System.out.println(username);
	}
	static{
		//name="gaga";
		username="yoyo";
		System.out.println(username);
	}
	public static class InnerClass{
        InnerClass(){
            System.out.println("== 我是一个内部类'InnerClass' ====");
        }

	
	public static void main(String[] args) {
		HelloWorld hw=new HelloWorld();
		System.out.println(hw.name);
		System.out.println(hw.username);
//		hw.B();
//		A();
	}

	}
}
