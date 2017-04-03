package com.readFile;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
//import org.dom4j.io.SAXReader; 

public class TestXml 
{
	public static void main(String[] args) throws Exception 
	{
		TestXml test = new TestXml();
		test.testDOM();
				
	}
	
	public void testDOM() throws Exception
	{
		long lasting = System.currentTimeMillis();   
		File f = new File("D:/properties/test4.xml");  
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder  builder = factory.newDocumentBuilder();
		Document doc = builder.parse(f);
		NodeList node = doc.getElementsByTagName("VALUE");
		for(int i =0;i<node.getLength();i++)
		{
			System.out.println("车牌号："+doc.getElementsByTagName("NO").item(i).getFirstChild().getNodeValue());
			System.out.println("地址："+doc.getElementsByTagName("ADDR").item(i).getFirstChild().getNodeValue());
		}
	}
	
	public void testDom4f() throws DocumentException
	{
		File f = new File("D:/properties/test4.xml");  
		SAXReader reader = 	new SAXReader();
		org.dom4j.Document doc = reader.read(f);
		
	}
}
