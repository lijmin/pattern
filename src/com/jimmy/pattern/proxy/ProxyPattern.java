package com.jimmy.pattern.proxy;

public class ProxyPattern {
	public static void main(String[] args) {
		MyProxy proxy = new MyProxy();  
		Operate operate = (Operate) proxy.bind(new OperateImpl());  
        operate.add();  
	}
}
