package libofei.demo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 * Alt-Enter
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DoOrderRequest implements Serializable{

    private static final long serialVersionUID = 4632876501724851634L;

    private String name;

}
