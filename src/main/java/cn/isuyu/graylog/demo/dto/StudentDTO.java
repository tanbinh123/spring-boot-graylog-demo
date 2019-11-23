package cn.isuyu.graylog.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019/11/23 10:54 上午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDTO {

    private String name;

    private Integer age;

    private String sex;

}
