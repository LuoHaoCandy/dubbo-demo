import com.luohao.inter.DemoInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by luohao on 17/11/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/account-consumer.xml"})
public class TestDubboConsumer {
    @Resource
    DemoInterface demoInterface;

    @Test
    public void test(){
        demoInterface.test();
    }
}
