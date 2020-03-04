package libofei.demo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DoOrderResponse implements Serializable{

    private static final long serialVersionUID = 3938659532219361525L;
    private Object data;

    private String code;

    private String memo;

}
