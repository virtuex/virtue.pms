package org.virtue.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.virtue.pojo.HotelInfo;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminIndexController {
    @RequestMapping(value = "/admin/index", method = {RequestMethod.GET})
    public String index(HttpSession session){

        return "behind/index";
    }
}
