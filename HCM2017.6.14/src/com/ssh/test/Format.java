package com.ssh.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Format {

	@Test
	public void test() {
		String a = "-1.2";
		double b = Double.valueOf(a);
		System.out.println(b);
		System.out.println(java.lang.Math.abs(b));
		
	}

}
