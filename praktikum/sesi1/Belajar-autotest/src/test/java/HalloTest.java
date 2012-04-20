import junit.framework.TestCase;
import junit.framework.Assert;

public HalloTest extends TestCase{
	public HalloTest(){
		super(testName);
	}

	protected void setUp() throws Exception{
		super.setUp();
		System.out.println("hello");
	}

	protected void tearDown() throws Exception{
		super.tearDown();
		System.out.println("World");
	}

	//TODO add test method here. The name mus begin with 'test'.for example :
	public void testHallo(){
		System.out.println("Hello world");
	}

	public void testAritmatic(){
		int a=10;
		int b=5;

		Assert.assertEquals(13, a+b);
	}
}