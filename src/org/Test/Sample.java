package org.Test;

import org.testng.annotations.Test;

public class Sample {
	@Test(groups="name")
	public void firstName() {
		System.out.println("firstname");

	}

	@Test(groups="name")
	public void lastName() {
		System.out.println("lastName");

	}

	@Test(groups="rollno")
	public void rollno() {
		System.out.println("rollno");

	}

	@Test(groups="email")
	public void email() {
		System.out.println("email");

	}

}
