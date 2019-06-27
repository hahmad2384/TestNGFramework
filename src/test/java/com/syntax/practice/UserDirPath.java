package com.syntax.practice;

import org.testng.annotations.Test;

public class UserDirPath {

	@Test
	public void printPath() {
		System.out.println(System.getProperty("user.dir"));
	}
}
