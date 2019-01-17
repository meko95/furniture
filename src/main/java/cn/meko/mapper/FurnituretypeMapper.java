package cn.meko.mapper;

import cn.meko.po.Furnituretype;
import cn.meko.po.FurnituretypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FurnituretypeMapper {
    int countByExample(FurnituretypeExample example);

    int deleteByExample(FurnituretypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(Furnituretype record);

    int insertSelective(Furnituretype record);

    List<Furnituretype> selectByExample(FurnituretypeExample example);

    Furnituretype selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") Furnituretype record, @Param("example") FurnituretypeExample example);

    int updateByExample(@Param("record") Furnituretype record, @Param("example") FurnituretypeExample example);

    int updateByPrimaryKeySelective(Furnituretype record);

    int updateByPrimaryKey(Furnituretype record);
}