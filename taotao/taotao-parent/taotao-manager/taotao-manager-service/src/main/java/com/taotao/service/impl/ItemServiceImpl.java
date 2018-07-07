package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.EasyUITree;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    public TbItem getItemById(Long id) throws Exception {
        return tbItemMapper.selectByPrimaryKey(id);
    }

    public EasyUIDataGridResult getItemList(int page, int rows) throws Exception {
        //分页插件
        PageHelper.startPage(page, rows);
        TbItemExample example = new TbItemExample();
        List<TbItem> items = tbItemMapper.selectByExample(example);
        //获取分页结果
        PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(items);
        //构造EasyUI返回数据
        EasyUIDataGridResult easyUIresult = new EasyUIDataGridResult();
        easyUIresult.setTotal(pageInfo.getTotal());
        easyUIresult.setRows(pageInfo.getList());
        return easyUIresult;
    }


    public List<EasyUITree> getItemCategoryListById(Integer id) throws Exception {

        TbItemCatExample example = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(Long.valueOf(id.toString()));
        List<TbItemCat> itemCats = tbItemCatMapper.selectByExample(example);
        List<EasyUITree> treeList = new ArrayList<EasyUITree>();
        //构造树
        for (TbItemCat cat : itemCats) {
            EasyUITree tree = new EasyUITree();
            String status = cat.getIsParent() ? "closed" : "open";
            tree.setState(status);
            tree.setId(Integer.valueOf(cat.getId().toString()));
            tree.setText(cat.getName());
            treeList.add(tree);
        }
        return treeList;
    }

}
