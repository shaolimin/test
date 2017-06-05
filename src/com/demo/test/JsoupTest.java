package com.demo.test;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupTest {

	public static void main(String args[]) throws Exception{
		JsoupTest jsoupTest = new JsoupTest();
//		jsoupTest.get1("http://www.baidu.com");
		jsoupTest.get2("http://www.baidu.com/s", "loadrunner");
	}
	
	//get���󲻴�����
	public Document get1(String url) throws IOException{
		Document document = Jsoup.connect(url).get();
		System.err.println(document);
		return document;
	}
	
	//get���������
	public Document get2(String url,String data) throws IOException{
		Connection connect = Jsoup.connect(url);
		connect.data("wd",data);
		Document document = connect.get();
		System.err.println(document);
		return document;
	}
	
	//post����
	public Document get3(String url,String data) throws IOException{
		Connection connect = Jsoup.connect(url);
		connect.data("wd",data);
		Document document = connect.post();
		System.err.println(document);
		connect.timeout(3000);
		//�Ӷ���
		//ͨ������ֵ�ж�,��������
		if(document.toString().contains("success")){
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		return document;
	}
}
