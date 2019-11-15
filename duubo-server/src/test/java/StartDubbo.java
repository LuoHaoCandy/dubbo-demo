import org.junit.Test;

/**
 * Created by luohao on 17/11/17.
 */


public class StartDubbo {

    @Test
    public void startUp(){
        System.setProperty("dubbo.application.logger", "slf4j");
        com.alibaba.dubbo.container.Main.main(null);
    }
}