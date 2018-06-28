package org.Test;

import org.testng.annotations.Test;

public class Samp_1 {
	@Test(priority=1,groups="a",parameters= {""})
	
public void a() {
System.out.println("test1");
}
	@Test
public void b() {
	System.out.println("test2");
}
	@Test
public void c() {
System.out.println("test3");
}
	@Test()
	public void d() {
	System.out.println("test4");
	}
		@Test()
	public void e() {
	System.out.println("test5");
	}
}
