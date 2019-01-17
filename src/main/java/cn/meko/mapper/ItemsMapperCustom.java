package cn.meko.mapper;


import cn.meko.custom.ItemsCustom;
import cn.meko.custom.ItemsQueryVo;

import java.util.List;

/**
 * Description:
 * Created by meko on 18-6-6上午5:25
 * Version 1.0
 */

public interface ItemsMapperCustom {
    public List<ItemsCustom> findItemsListByLike(ItemsQueryVo itemsQueryVo)throws Exception;
}
