package fedricbeaust;

import static org.testng.Assert.assertEquals;

public class MyTest {private int count = 0;

public void test1() {
	count++;
	System.out.println("count++: " + count);
	assertEquals(1, count);
	
}

public void test2() {
	count++;
	System.out.println("count++: " + count);
	assertEquals(1, count);
}


}
