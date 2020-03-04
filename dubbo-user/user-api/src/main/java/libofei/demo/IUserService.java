package libofei.demo;

import libofei.demo.dto.UserLoginRequest;
import libofei.demo.dto.UserLoginResponse;

public interface IUserService {

    /**
     * 登录
     * @param request
     * @return
     */
    UserLoginResponse login(UserLoginRequest request);
}
