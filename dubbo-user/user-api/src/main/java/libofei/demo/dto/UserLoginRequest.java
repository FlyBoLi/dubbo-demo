package libofei.demo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


@Data
@EqualsAndHashCode
public class UserLoginRequest implements Serializable{

    private static final long serialVersionUID = -1885649422664747478L;
    private String name;

    private String password;

    @Override
    public String toString() {
        return "UserLoginRequest{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
