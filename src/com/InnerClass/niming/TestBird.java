package com.InnerClass.niming;

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
