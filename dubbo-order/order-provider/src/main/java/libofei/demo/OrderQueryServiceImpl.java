package libofei.demo;


import org.springframework.stereotype.Service;


@Service("orderQueryService")
public class OrderQueryServiceImpl implements IOrderQueryService{

    @Override
    public String doQuery(String params) {
        System.out.println(params);
        return "hello,菲菲";
    }
}
