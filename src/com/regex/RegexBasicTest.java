package com.regex;

/**
 * 正则表达式实例
 * 
 * (一)支持的基本通配符：
.   -可以匹配任意字符
\s  -代表一个任意空白(空格、Tab)。
\S  -代表一个任意的非空白。
\d  -代表一个任意的数字(digital)。
\D  -代表一个任意的非数字。
\w  -代表一个单词字符。
-W  -代表一个任意的非单词字符
注意：对于特殊字符，实际使用时记住要转义\ ，如：( ) [ ] { } \ ? * + ^（一行的开头） $（一行的结尾）|

(二)取值范围（用作出现次数的“副词”）
? --代表它前面的东西可以出现0~1次
+ --代表它前面的东西可以出现1~N次
* --代表它前面的东西可以出现0~N次 
{n,m} --代表它前面的东西可以出现n~m次
{n,} --代表它前面的东西至少出现n次
{,m} --代表它前面的东西最多出现m次
{n} --代表它前面的东西必须出现n次
(三)方括号表达式
枚举：[ab1]  --代表a或b或者1。
范围：[a-c]  --代表a,b,c中的任意一个字符。
枚举与范围：[a-c1-3]--代表a,b,c,1,2,3中的任意一个字符。
表示求否：[^a-c] --代表不含a,b,c其中任意一个字符。
表示求交：[a-g&&[^b-d]]：--代表a,e,f,g中的任意一个字符。
表示必须含有其中之一：(com|org|cn)
总结：一个字符用\，多个字符用[]，字符次数用{} 
 * @author lhs
 *
 */
public class RegexBasicTest {

	public static void main(String[] args) {
		//空白字符\
		System.out.println(" ".matches("\\."));
		//单个字符
		System.out.println("a".matches("."));
		//0~1个字符
		System.out.println("a".matches("a?"));
		 // 1~N个a  
        System.out.println("aaaa".matches("a+")); 
        // 0~N个a  
        System.out.println("".matches("a*"));  
        // 1~N个q和1个0~9之间的数字  
        System.out.println("qqqqqq3".matches("q+[0-9]"));
        // 12~100个数字  
        System.out.println("12345667890123".matches("\\d{12,100}")); 
     // 0~3个数字分别以.分割  
        System.out.println("192.168.0.1"  
                .matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));  
     // 第一个数字0~2，第二个数字0~9，第三个数字0~9  
        System.out.println("192".matches("[0-2][0-9][0-9]"));//-表示范围； ，表示枚举
        System.out.println("099".matches("[0,2][0,9][0,9]"));
        // 4个任意空白
        System.out.println("    ".matches("\\s{4}"));
        // 特殊字符\需转义  
        System.out.println("\\".matches("\\\\"));
        // 以h开头，中间有0~N个字符，最后以o结尾  
        System.out.println("hfsoo".matches("^h.*o$"));
        // 以任意空白且不以换行开头为开头，并以换行结尾  
        System.out.println(" \n".matches("^[\\s&&[^\\n]].*\\n$"));
     // 以h开头，中间1~3个字母尾随一个o，接着空白连着0~N个字符并以d结尾  
        System.out.println("hweofadd".matches("^h[a-z]{1,3}o.*d$"));
     // 0~N个字符，连接4个数字和一个数字
        System.out.println("daf2342e".matches("^.*\\d{4}[a-z]{1,1}$"));
	}
}
