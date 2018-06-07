package com.proxy.cglibProxy;

/**
 * https://www.cnblogs.com/best/p/5679656.html
 * @author pact
 *
 */
public class CGLIBProxyTest {
	public static void main(String[] args) {      
        BookManage bookFacade=new BookManage();
        BookManageCGLIB  cglib=new BookManageCGLIB();  
        BookManage bookCglib=(BookManage)cglib.getInstance(bookFacade);  
        bookCglib.addBook();  
    }  
}
