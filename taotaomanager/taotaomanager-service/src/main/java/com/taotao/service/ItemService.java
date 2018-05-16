package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {

    //测试整合使用的根据id查询商品
    TbItem getItemById(Long itemId);

    //分页查询商品列表
    EasyUIDataGridResult getItemList(int page,int rows);

}
