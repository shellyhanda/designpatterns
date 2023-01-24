package com.shelly.demo.singleton;

import java.io.Serializable;

public class SingletonLogger implements Serializable, Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	private static final long serialVersionUID = 1L;
	private static volatile SingletonLogger instance;

	private SingletonLogger(String msg) {
		System.out.println(msg);
	}

	public static SingletonLogger getInstance() {
		if (instance == null) {
			synchronized (SingletonLogger.class) {
				if (instance == null) {
					instance = new SingletonLogger("This is log message");
				}
			}
		}
		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

}
