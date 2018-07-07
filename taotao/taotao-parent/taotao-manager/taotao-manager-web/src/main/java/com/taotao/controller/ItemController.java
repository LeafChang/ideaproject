package com.taotao.controller;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.EasyUITree;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.logging.Logger;


/**
 * 商品查询Controller（Item）
 */
@Controller
public class ItemController {

    private static Logger log =Logger.getLogger(ItemController.class.getName());

    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId) {
        TbItem tb = null;
        try {
            log.fine("=========before========");
            tb =  itemService.getItemById(itemId);
            log.fine("=========after========");
        }catch (Exception e){
            log.warning("Exception when get Item by itemId...");
        }
        return tb;
    }


   @RequestMapping("/item/list")
    @ResponseBody
    public EasyUIDataGridResult findItemList(@RequestParam Integer page,@RequestParam Integer rows){
        EasyUIDataGridResult result = null;
        try {
            result = itemService.getItemList(page,rows);
        }catch (Exception e){
            log.warning("Exception when get item List...");
        }
        return result;
    }

    @RequestMapping("/item/cat/list")
    @ResponseBody
    public List<EasyUITree> findItemCategoryByCatId(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id){
        List<EasyUITree> itemCats = null;
        try {
            itemCats = itemService.getItemCategoryListById(id);
        }catch (Exception e){
            log.warning("Exception when get items category....");
        }
        return  itemCats;
    }




}
