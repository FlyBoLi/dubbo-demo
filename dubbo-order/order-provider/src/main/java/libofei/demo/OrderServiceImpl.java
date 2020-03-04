package libofei.demo;

import libofei.demo.dto.UserLoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("orderService")
public class OrderServiceImpl implements IOrderServices{

//    @Autowired
//    private IUserService userService;

    public DoOrderResponse doOrder(DoOrderRequest request) {
        UserLoginRequest userLoginRequest = new UserLoginRequest();
//        System.out.println(userService.login(userLoginRequest));
        System.out.println("曾经来过："+request);
        DoOrderResponse response=new DoOrderResponse();
        response.setCode("1000");
        response.setMemo("处理成功");
        return response;
    }
}
