package cn.meko.service.impl;

import cn.meko.Utils.SystemConst;
import cn.meko.po.Customer;
import cn.meko.service.LoginService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Description: //TODO
 * Created by meko on 19-1-16下午8:18
 * Version 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public Boolean isLogin(HttpSession session) {
        Customer customer = (Customer) session.getAttribute(SystemConst.USER_SESSION);
        if (customer != null)
            return true;
        return false;
    }
}
