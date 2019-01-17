package cn.meko.custom;


import cn.meko.po.Furnituretype;
import cn.meko.po.Order;
import cn.meko.po.Orderdetail;

/**
 * Description:
 * Created by meko on 18-6-25下午8:08
 * Version 1.0
 */

public class OrderVo {
    private CustomerCustom customerCustom;
    private ItemsCustom itemsCustom;
    private Order order;
    private Orderdetail orderdetail;
    private Furnituretype furnituretype;

    public CustomerCustom getCustomerCustom() {
        return customerCustom;
    }

    public void setCustomerCustom(CustomerCustom customerCustom) {
        this.customerCustom = customerCustom;
    }

    public ItemsCustom getItemsCustom() {
        return itemsCustom;
    }

    public void setItemsCustom(ItemsCustom itemsCustom) {
        this.itemsCustom = itemsCustom;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Orderdetail getOrderdetail() {
        return orderdetail;
    }

    public void setOrderdetail(Orderdetail orderdetail) {
        this.orderdetail = orderdetail;
    }

    public Furnituretype getFurnituretype() {
        return furnituretype;
    }

    public void setFurnituretype(Furnituretype furnituretype) {
        this.furnituretype = furnituretype;
    }
}
