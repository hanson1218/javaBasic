package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//一段带有输入参数的可执行语句块”。
//(Type1 param1, Type2 param2, ..., TypeN paramN) -> {
//statment1;
//statment2;
//.............
//return statmentM;
//}
public class LambdaTest 
{
	public static void main(String[] args) {
		InterfaceA obj;
		
		// old  
        obj = new InterfaceA(){  

			@Override
			public void showA(String a) {
				System.out.println("A" + a);
				
			}  
        };
        
     // java 8  
        obj = a -> {  
            System.out.println("Multiple" +a);  
            System.out.println("Lines ... ");  
        };  
		
		LambdaTest lamnda = new LambdaTest();
		lamnda.testLambda();
		obj.showA("a");
		lamnda.testForeach();
	}
	
	
	
	public void testLambda()
	{
		String separator = ",";
		Arrays.asList( "a", "b", "d" ).forEach( 
		    ( String e ) -> System.out.print( e + separator ) );
	}
	
	public void testForeach()
	{
		
		List<Integer> list =Arrays.asList(1,2,3,5,6); 
		
		 // normal loop  
        for(Integer i : list){  
            System.out.println(i);  
        }  
           
        // Java 8 forEach - normal  
      /*  Consumer<Integer> action = new IConsumer();  
        list.forEach(action)*/;  
         
        List testList = new ArrayList<>();
        // Java 8 forEach - use lambda expressions.  
        // see how we do it in one liner  
        list.forEach(each -> testList.add(each));
        testList.forEach(each1 -> System.out.println(each1));
	}
	
	
}
