package com.io.inputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class BufferedInputStreamTest {

	public static final String Path = "e://test.txt";
	
	@Test
	public void testGetDataFromFile() throws IOException {
		/*InputStream inputStream = new InputStream() {
			
			@Override
			public int read() throws IOException {
				// TODO Auto-generated method stub
				return 1;
			}
		};*/
		byte [] buffer  = new byte[10240];
		InputStream inputStream = new FileInputStream(Path);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
		int numberRead=0;
		while(true) {
			numberRead = bufferedInputStream.read(buffer);
			if (numberRead ==-1) {
				break;
			}
			String chunk = new String(buffer, 0, numberRead);
            System.out.println(chunk);
		}
		inputStream.close();
	}
	
	@Test
	public void testFileOutputStream() {
		try {
			FileOutputStream fos=new FileOutputStream("E://BOSDemo.txt");
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			String content="我是缓冲输出流测试数据！";
			bos.write(content.getBytes(),0,content.getBytes().length);
			bos.flush();
			bos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	
	@Test
	public void testCopyFile() {
		try {
			FileInputStream fis = new FileInputStream("D://111.PNG");
			BufferedInputStream bif = new BufferedInputStream(fis);
			
			FileOutputStream fos = new FileOutputStream("D://2.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			
			byte[] bytes = new byte[1024];
			int size = 0;
			while((size = bif.read(bytes))!=-1) {
				bos.write(bytes);
			}
			bos.flush();
			bif.close();
			bos.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
