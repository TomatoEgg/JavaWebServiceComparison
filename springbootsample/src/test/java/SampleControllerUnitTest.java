/**
 * Created by JunXie on 2017-07-06.
 */

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

public class SampleControllerUnitTest {
    @Test
    public void testSayHello() {
        SampleController sampleController = new SampleController();

        //assert correct type/impl
        assertEquals(sampleController.getClass(), (SampleController.class));

        //assert true
        assertEquals("Hello World!", sampleController.sayHello());
    }
}
