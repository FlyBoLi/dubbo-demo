package libofei.demo.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class Response implements Serializable{

    private static final long serialVersionUID = -5807020458387184045L;

    private String code;

    private String memo;



    @Override
    public String toString() {
        return "Response{" +
                "code='" + code + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}
