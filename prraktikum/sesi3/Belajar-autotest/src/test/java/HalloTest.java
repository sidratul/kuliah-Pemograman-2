import junit.framework.TestCase;

public HalloTest extends TestCase{
	public HalloTest(){
		super(testName);
	}

	protected void setUp() throws Exception{
		super.setUp();
	}

	protected void tearDown() throws Exception{
		super.tearDown();
	}
	//TODO add test method here. The name mus begin with 'test'.for example :
	public void testHallo(){
		System.out.println("Hello world");
	}
}