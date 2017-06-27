package JUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestJava {

	@Test
	public void testAddReply() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectReplyByTid() {
		System.out.println("@Test");//调用自己要测试的方法
	}

	@Test(timeout=1)  
    public void testTimeout() {  
        System.out.println("超时测试");  
    }  
	
	@Before
	public void testBefore(){  
        System.out.println("@Before");  
    }  

}
