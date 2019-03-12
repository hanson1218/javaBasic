package com.httpclients;

import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class Test {
	void getToken(HttpServletRequest request, HttpServletResponse response){/*
		try {
				
				 * 加载keyStore d:\\tw.keystore
				 
				KeyStore trustStore  = KeyStore.getInstance(KeyStore.getDefaultType());
				FileInputStream instream = new FileInputStream(new File("d:\\tw.keystore"));
				try {
	                trustStore.load(instream, "654321".toCharArray());
	            } finally {
	                try { instream.close(); } catch (Exception ignore) {}
	            }
	            
	             * 创建sslSocket工厂,将trustStore注入
	             
	            SSLSocketFactory socketFactory = new SSLSocketFactory(trustStore);
	            //创建Scheme
	            Scheme sch = new Scheme("https", 8443, socketFactory);
	            //注册Scheme
	            httpclient.getConnectionManager().getSchemeRegistry().register(sch);
	            //创建sslPost请求
	            HttpPost httppost = new HttpPost("https://127.0.0.1:8080/iam/sso?method=getToken");
	    		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
	    		formparams.add(new BasicNameValuePair("masterAcc", "bocoshenxueliang"));
	    		formparams.add(new BasicNameValuePair("staticPwd", "adeeae3dfxxcvdvdq=="));
	    		formparams.add(new BasicNameValuePair("appid", "0aa2ec15b20003"));
	    		formparams.add(new BasicNameValuePair("clientIp", request.getRemoteAddr()));
	    		UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
	    		httppost.setEntity(uefEntity);
	            System.out.println("executing request" + httppost.getRequestLine()); 
	            HttpResponse response = httpclient.execute(httppost);
	            HttpEntity entity = response.getEntity();
	            System.out.println("----------------------------------------");
	            System.out.println(response.getStatusLine());
	            if (entity != null) {
	              	System.out.println("Response content length: " + entity.getContentLength());
	              	String ss = EntityUtils.toString(entity);
	              	System.out.println(ss);
		            System.out.println("----------------------------------------");
		            EntityUtils.consume(entity); 
	            }

			} catch (Exception e) {
				e.printStackTrace();
			} finally {httpclient.getConnectionManager().shutdown();
			}
	*/}


}
