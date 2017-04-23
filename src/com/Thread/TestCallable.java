package com.Thread;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//(1) Callable规定的方法是 call(), Runnable规定的方法是 run()。

//(2) Callable的任务执行后可返回值，而 Runnable的任务是不能返回值。

//(3) call方法可以抛出异常， run方法不可以。

//(4)运行 Callable任务可以拿到一个 Future对象

//Future<T>相当于容器，存放执行的结果，isDone:是否执行完成，get():拿到执行结果，会阻塞。可以先用future去执行逻辑，等执行完成后再get结果
public class TestCallable implements Callable<String>
{

	private int id; 
	
	public TestCallable(int id)
	{
		this.id = id;
	}
	@Override
	public String call() throws Exception {
		return  "result of TaskWithResult " + id;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		ExecutorService executor = Executors.newCachedThreadPool();
		ArrayList<Future<String>> list = new ArrayList<Future<String>>();//Future 相当于是用来存放Executor执行的结果的一种容器  
		for(int i =0;i<10;i++)
		{
			list.add(executor.submit(new TestCallable(i)));
		}
		
		/*list.stream().filter(e -> e.isDone()).forEach(e -> {
			System.out.println(e.get());
		});*/
		for(Future<String> future:list)
		{
			if(future.isDone()){
				System.out.println(future.get());
			}
		}
		executor.shutdown();
	
	}
	
}
