package cn.meko.controller;

import cn.meko.po.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Description: //TODO
 * Created by meko on 19-1-16下午7:49
 * Version 1.0
 */
@Controller
public class LoginController {


    @ResponseBody
    @RequestMapping("/login")
    public String loginCheck(Customer customer, HttpSession session)throws Exception{
        if(customer.getPhone().equals("123456")) {
            session.setAttribute("user_session", customer);
            return "登录成功";
        }
        return "登录失败";

    }

    @ResponseBody
    @RequestMapping("/islogin")
    public String isLogin(HttpSession session)throws Exception{
        Customer customer =(Customer)session.getAttribute("user_session");
        if(customer != null)
            return "is login";
        return "login fail";
    }

    @ResponseBody
    @RequestMapping("/loginout")
    public String loginOut(HttpSession session)throws Exception{
        if(session.getAttribute("user_session")!=null)
            session.removeAttribute("user_session");
        return "login out";
    }
}
