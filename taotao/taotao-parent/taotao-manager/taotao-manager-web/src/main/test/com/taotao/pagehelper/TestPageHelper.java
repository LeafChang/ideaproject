package com.taotao.pagehelper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestPageHelper {

    public TbItemMapper tbItemMapper = null;

    @Before
    public void before(){
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        tbItemMapper = app.getBean(TbItemMapper.class);
    }

    @Test
    public void testPageHelper() throws Exception{

        PageHelper.startPage(1,10);
        TbItemExample example = new TbItemExample();

        List<TbItem> items = tbItemMapper.selectByExample(example);

        PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(items);

        System.out.println(pageInfo.getTotal());



    }
}
