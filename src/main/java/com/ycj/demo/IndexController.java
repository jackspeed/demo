package com.ycj.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JackSpeed
 * @version V1.0 <>
 * @date 2018-09-10 18:04
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "docker Jenkins 测试完成，完美！！！！！！！";
    }

    @RequestMapping(value = "/gitee", method = RequestMethod.GET)
    public String index2() {
        return "下一步  实现 docker Jenkins + gitee o(╥﹏╥)o";
    }
}
