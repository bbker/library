package NEWlibrary;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Administration a=new Administration("Zhang",123456);
		assertEquals(a.name, "Zhang");
		assertEquals(a.password , 123456);
		assertEquals(a.who() , "  张三 管理员");
		Student s=new Student("wangwu",333333);
		assertEquals(s.name, "wangwu");
		assertEquals(s.password , 333333);
		assertEquals(s.who() , "  王五 同学");
		Teacher t=new Teacher("lisi",999999);
		assertEquals(t.name, "lisi");
		assertEquals(t.password , 999999);
		assertEquals(t.who() , "  李四 老师");
	}

}
