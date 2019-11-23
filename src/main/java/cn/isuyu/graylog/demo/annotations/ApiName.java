package cn.isuyu.graylog.demo.annotations;

import java.lang.annotation.*;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019/11/23 11:06 上午
 */
@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiName {

    String name() default "未知";

}
