package cn.meko.service;

import cn.meko.custom.ItemsCustom;
import cn.meko.custom.ItemsQueryVo;

import java.util.List;

/**
 * Description:
 * Created by meko on 18-6-25下午6:41
 * Version 1.0
 */

public interface ItemsService {
    public List<ItemsCustom> findItemsListByLike(ItemsQueryVo itemsQueryVo) throws Exception;
    public ItemsCustom findItem(ItemsQueryVo itemsQueryVo) throws Exception;

}
