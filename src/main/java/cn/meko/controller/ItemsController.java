package cn.meko.controller;

import cn.meko.custom.ItemsCustom;
import cn.meko.custom.ItemsQueryVo;
import cn.meko.service.ItemsService;
import cn.meko.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Description:
 * Created by meko on 18-6-25下午6:47
 * Version 1.0
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @Autowired
    private LoginService loginService;

    @RequestMapping("/queryItems")
    public String queryItems(Model model, ItemsQueryVo itemsQueryVo, HttpSession session) throws Exception{
        if (!loginService.isLogin(session))
            return "is not login";
        List<ItemsCustom> itemsCustomList = itemsService.findItemsListByLike(null);
        model.addAttribute("itemsCustomList",itemsCustomList);
        System.out.println(model);
        return "/items/itemsList";
    }
}
