package pers.congcong.mySpringMyBatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created by 聪聪 on 2018/6/25 0025.
 */
@Controller
public class IndexController {
    @RequestMapping(value = {"/", "index"})
    public ModelAndView dicts() {
        System.out.println("cccccccccccccccc");
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("now", new Date());
        return mv;
    }


}
