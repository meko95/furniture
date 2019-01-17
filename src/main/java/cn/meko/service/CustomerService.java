package cn.meko.service;

import cn.meko.custom.CustomerCustom;
import cn.meko.custom.ItemsQueryVo;
import cn.meko.custom.OrderVo;

import java.util.List;

/**
 * Description:
 * Created by meko on 18-6-25下午7:53
 * Version 1.0
 */

public interface CustomerService {
    public List<CustomerCustom> findCustomerByLike(ItemsQueryVo itemsQueryVo)throws Exception;
    public CustomerCustom findCustomer(ItemsQueryVo itemsQueryVo)throws Exception;

    /**
     * 插入用户购买的详情信息，用户不存在时插入用户
     * @param orderVo 订单的所有信息包括顾客、购买的商品、以及订单信息
     * @throws Exception
     */
    public void insertCustomerInfo(OrderVo orderVo)throws Exception;

}
