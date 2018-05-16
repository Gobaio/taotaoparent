package com.taotao.service.impl;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.pojo.TbItemCatExample.Criteria;
import com.taotao.service.ItemCatService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemCatServiceImpl implements ItemCatService {
    @Resource
    private TbItemCatMapper itemCatMapper;

    @Override
    public List<EasyUITreeNode> getItemCatList(Long parentId) {
        //根据parentId查询
        TbItemCatExample itemCatExample=new TbItemCatExample();
        //设置查询条件
        Criteria criteria= itemCatExample.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        //执行查询
       List<TbItemCat> list = itemCatMapper.selectByExample(itemCatExample);
       //转换成EasyUITreeNode列表
        List<EasyUITreeNode> resultList = new ArrayList<>();
        for(TbItemCat itemCat:list){
            //创建一个节点
            EasyUITreeNode treeNode = new EasyUITreeNode();
            treeNode.setId(itemCat.getId());
            treeNode.setText(itemCat.getName());
            treeNode.setState(itemCat.getIsParent()?"closed":"open");
            resultList.add(treeNode);
        }
        return resultList;
    }
}
