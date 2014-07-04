package com.jimmy.pattern;

public class ProxyPattern {
	public static void main(String[] args) {
		MyProxy proxy = new MyProxy();  
		Operate operate = (Operate) proxy.bind(new OperateImpl());  
        operate.add();  
	}
}
