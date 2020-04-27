package com.alibaba.test;

import com.alibaba.dao.ItemsDao;
import com.alibaba.domain.Items;
import com.alibaba.service.ItemsService;
import com.alibaba.service.impl.ItemsServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @wx
 * @version1.0
 */
public class ItemsTest {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService itemsService = applicationContext.getBean(ItemsService.class);
        Items items = itemsService.findById(1);
        System.out.println(items);
    }
}
