import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestUnit 
{
	Unit u = null;
    @Before
    public void setUp()
    {
    	u = new Unit();
    }
    @After
    public void tearDown() 
    {
    	u = null;
    }
	@Test
	public void testArea() 
	{
		assertEquals(1.2, u.area(2,3));
	}

}
