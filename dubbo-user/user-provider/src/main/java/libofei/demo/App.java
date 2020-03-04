package libofei.demo;

import com.alibaba.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
//        Main.main(args);



        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("order-consumer.xml");

        //用户下单过程
        IOrderServices services = (IOrderServices) context.getBean("orderServices");

        /*IOrderQueryService orderQueryService=(IOrderQueryService)context.getBean("orderQueryServices");

        System.out.println(orderQueryService.doQuery("mic"));*/
        DoOrderRequest request = new DoOrderRequest();
        request.setName("mic");
        services.doOrder(request);
        for (int i=0;i<10;i++) {
            DoOrderResponse response = services.doOrder(request);
            System.out.println(response);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
