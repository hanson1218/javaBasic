package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CountStr {

	public static void main(String[] args) throws Exception{
		CountStr countStr = new CountStr();
//		countStr.count("e://test.txt");
		countStr.test("e://test.txt");
	}
	
	private int count(String path) {
		try {
			/*BufferedReader br = new BufferedReader(new FileReader(path));
			StringBuilder sb = new StringBuilder();*/
			File file = new File(path);
			InputStream is = new FileInputStream(file);
			byte b[] = new byte[1024];
			int a = is.read(b);
			String str[] = new String(b,0,a).split("");
			int count = 0;
			int huanHangCount = 0;
			for(int i = 0;i<str.length;i++){
				System.out.print(str[i]);
			}
				
			
			for(int i = 0;i<str.length;i++){
				if("a".equals(str[i]))count++;
				if("\n".equals(str[i]))huanHangCount++;
			}
			System.out.println(count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	private void test(String path) throws Exception{
		File file = new File(path);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
         
        String line;
         
        // Initializing counters
        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;
        int paragraphCount = 1;
        int whitespaceCount = 0;
         
        // Reading line by line from the 
        // file until a null is returned
        while((line = reader.readLine()) != null)
        {
            if(line.equals(""))
            {
                paragraphCount++;
            }
            if(!(line.equals("")))
            {
                 
                characterCount += line.length();
                 
                // \\s+ is the space delimiter in java
                String[] wordList = line.split("\\s+");
                 
                countWord += wordList.length;
                whitespaceCount += countWord -1;
                 
                // [!?.:]+ is the sentence delimiter in java
                String[] sentenceList = line.split("[!?.:]+");
                 
                sentenceCount += sentenceList.length;
            }
        }
         
        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of sentences = " + sentenceCount);
        System.out.println("Total number of characters = " + characterCount);
        System.out.println("Number of paragraphs = " + paragraphCount);
        System.out.println("Total number of whitespaces = " + whitespaceCount);
    }
	
}
