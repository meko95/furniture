package cn.meko.service;

import javax.servlet.http.HttpSession;

/**
 * Description: //TODO
 * Created by meko on 19-1-16下午8:16
 * Version 1.0
 */

public interface LoginService {
    Boolean isLogin(HttpSession session);
}
