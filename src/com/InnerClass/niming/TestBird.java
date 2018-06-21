package com.InnerClass.niming;

/**
 * 匿名内部类不能访问外部类方法中的局部变量，除非该变量被声明为final类型
 * Java 8更加智能：如果局部变量被匿名内部类访问，那么该局部变量相当于自动使用了final修饰。
 * @author pact
 *
 */
public class TestBird {

	public static void main(String[] args) {
		TestBird test = new TestBird();
        test.test(new Bird("final") { //abstract 不能直接new ,使用匿名内部类创建bird实例
            
            public int fly() {
                return 10000;
            }
            
        });
        
        Object object = new Object() {
			public int hashCode() {
				return 1;
			}
		};
		System.out.println(object.hashCode());
	}
	
	public void test(Bird bird){
        System.out.println(bird.getName() + "能够飞 " + bird.fly() + "米");
    }
}
