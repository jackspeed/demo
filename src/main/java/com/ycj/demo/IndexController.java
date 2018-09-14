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

    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    public String index2() {
        return "docker Jenkins + gitee o(╥﹏╥)o";
    }
}
