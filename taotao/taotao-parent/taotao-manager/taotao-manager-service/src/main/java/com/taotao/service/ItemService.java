package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.EasyUITree;
import com.taotao.pojo.TbItem;

import java.util.List;


public interface ItemService {

    /**
     * 根据id 查询商品
     * @param id
     * @return
     * @throws Exception
     */
    public TbItem getItemById(Long id) throws  Exception;

    /**
     *  查询商品列表
     * @param page
     * @return
     * @throws Exception
     */
    public EasyUIDataGridResult getItemList(int page,int rows) throws Exception;


    /**
     * 获取商品分类
     * @param id
     * @return
     * @throws Exception
     */
    public List<EasyUITree> getItemCategoryListById(Integer id) throws Exception;

}
