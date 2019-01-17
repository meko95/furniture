package cn.meko.custom;

import cn.meko.po.Items;

import java.util.List;

/**
 * Description:
 * Created by meko on 18-6-25下午6:35
 * Version 1.0
 */

public class ItemsQueryVo {
    private Items items;
    private ItemsCustom itemsCustom;
    private List<ItemsCustom> itemsCustomList;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public ItemsCustom getItemsCustom() {
        return itemsCustom;
    }

    public void setItemsCustom(ItemsCustom itemsCustom) {
        this.itemsCustom = itemsCustom;
    }

    public List<ItemsCustom> getItemsCustomList() {
        return itemsCustomList;
    }

    public void setItemsCustomList(List<ItemsCustom> itemsCustomList) {
        this.itemsCustomList = itemsCustomList;
    }
}
