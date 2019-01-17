package cn.meko.service.impl;

import cn.meko.custom.ItemsCustom;
import cn.meko.custom.ItemsQueryVo;
import cn.meko.mapper.ItemsMapper;
import cn.meko.mapper.ItemsMapperCustom;
import cn.meko.po.Items;
import cn.meko.service.ItemsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * Created by meko on 18-6-25下午6:43
 * Version 1.0
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapperCustom itemsMapperCustom;

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public List<ItemsCustom> findItemsListByLike(ItemsQueryVo itemsQueryVo) throws Exception {
        return itemsMapperCustom.findItemsListByLike(itemsQueryVo);
    }

    @Override
    public ItemsCustom findItem(ItemsQueryVo itemsQueryVo) throws Exception {
        Items item = itemsMapper.selectByPrimaryKey(itemsQueryVo.getItemsCustom().getItemsId());
        ItemsCustom itemsCustom = null;
        BeanUtils.copyProperties(item,itemsCustom);
        return itemsCustom;
    }
}
