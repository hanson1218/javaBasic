package com.Thread.thread;

/**
 * join()：加入到主线程中执行
 * 主线程调用子线程的join方法时，这个方法会挂起调用线程，知道被调用线程执行完，调用线程才会接着执行，
 * @author LiHuaSheng
 *
 */
public class JoinTest {

	static JoinTest t=new JoinTest();
		class T1 extends Thread{
			@Override
			public void run() {
				//T1线程中要处理的东西
				System.out.println("T1线程执行");
				   for(int i=0;i<10;i++){
			            System.out.println(this.getName() + ":" + i);
			        }
			}
		}
		
		class T2 extends Thread{
			@Override
			public void run() {
				//T2线程中要处理的东西
				System.out.println("T2线程执行");
				for(int i=0;i<10;i++){
		            System.out.println(this.getName() + ":" + i);
		        }
			}
		}
		
		class T3 extends Thread{
			@Override
			public void run() {
				//T3线程中要处理的东西
				System.out.println("T3线程执行");
				for(int i=0;i<10;i++){
		            System.out.println(this.getName() + ":" + i);
		        }
			}
		}
		

		public static void main(String[] args) {
			try {
				t.new T1().start();//启动t1线程
				t.new T1().join();//阻塞主线程，执行完t1再返回
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				t.new T2().start();//启动t2线程
				t.new T2().join();//阻塞主线程，执行完t2再返回
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				t.new T3().start();//启动t3线程
				t.new T3().join();//阻塞主线程，执行完t3再返回
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	

}
