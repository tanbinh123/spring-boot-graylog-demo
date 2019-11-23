package cn.isuyu.graylog.demo.controller;

import cn.isuyu.graylog.demo.annotations.ApiName;
import cn.isuyu.graylog.demo.dto.StudentDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2019/11/23 10:52 上午
 */
@RestController
public class LogController {


    @RequestMapping(value = "test")
    @ApiName(name = "单个接收方法")
    public StudentDTO test3(String name,Integer age,String sex) {
        StudentDTO studentDTO = new  StudentDTO(name,age,sex);
        return studentDTO;
    }


    @GetMapping(value = "test1")
    @ApiName(name = "单个RequestParam注解接收方法")
    public StudentDTO test(@RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "age", defaultValue = "20") Integer age,
                           @RequestParam(value = "sex",defaultValue = "男") String sex) {
        StudentDTO studentDTO = new  StudentDTO(name,age,sex);
        return studentDTO;
    }

    @RequestMapping(value = "test2")
    @ApiName(name = "对象接收方法")
    public StudentDTO test(StudentDTO studentDTO) {
        return studentDTO;
    }

    @PostMapping(value = "test3")
    @ApiName(name = "JSON对象接收方法")
    public StudentDTO test1(@RequestBody StudentDTO studentDTO) {

        return studentDTO;
    }

    @RequestMapping(value = "test/{name}")
    @ApiName(name = "链接参数接收方法")
    public StudentDTO test1(@PathVariable String name) {
        StudentDTO studentDTO = new  StudentDTO(name,null,null);

        return studentDTO;
    }





}
