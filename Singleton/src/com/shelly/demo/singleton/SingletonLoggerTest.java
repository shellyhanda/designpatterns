package com.shelly.demo.singleton;

public class SingletonLoggerTest {

	public static void main(String[] args) {
		SingletonLogger singletonLogger = SingletonLogger.getInstance();
		SingletonLogger singletonLogger2 = SingletonLogger.getInstance();
		System.out.println(singletonLogger == singletonLogger2);

	}

}
