package com.classLoad.comparison;

/**
 * 测试Class.forName和classloader.getClassLoader的区别
 * class.forName()前者除了将类的.class文件加载到jvm中之外，还会对类进行解释，执行类中的static块。
	而classLoader只干一件事情，就是将.class文件加载到jvm中，不会执行static中的内容,只有在newInstance才会去执行static块。
 * @author LiHuaSheng
 *
 */
public class ClassReflectTest {
	
	public static void main(String[] args) {
		
		String wholeNameLine = "com.classLoad.comparison.Line";
		String wholeNamePoint = "com.classLoad.comparison.Point";
        System.out.println("下面是测试Classloader的效果");
        testClassloader(wholeNameLine, wholeNamePoint);
        System.out.println("----------------------------------");        
        System.out.println("下面是测试Class.forName的效果");        
        testForName(wholeNameLine, wholeNamePoint);

	}

	
	/**    
	 * 
	 * classloader     
	 * */    
	private static void testClassloader(String wholeNameLine, String wholeNamePoint) {        
		Class<?> line;        
		Class<?> point;       
		ClassLoader loader = ClassLoader.getSystemClassLoader();        
		try {            
			line = loader.loadClass(wholeNameLine);            
			point = loader.loadClass(wholeNamePoint);            
			//demo = ClassloaderAndForNameTest.class.getClassLoader().loadClass(wholeNamePoint);//这个也是可以的            
			System.out.println("line   " + line.getName());            
			System.out.println("point   " + point.getName());        
		} catch (ClassNotFoundException e) {            
			e.printStackTrace();        
		}
		
	}

	
	/** 
	 * Class.forname
	 * @param wholeNameLine
	 * @param wholeNamePoint
	 */
	private static void testForName(String wholeNameLine, String wholeNamePoint) {        
		try {            
			Class line = Class.forName(wholeNameLine);            
			Class point = Class.forName(wholeNamePoint);            
			System.out.println("line   " + line.getName());            
			System.out.println("point   " + point.getName());        
		} catch (Exception e) {            
			e.printStackTrace();        
		}
	}

	
}
