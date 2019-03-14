package com.jkslw.service.impl;

import com.jkslw.dao.GoodsDao;
import com.jkslw.model.Goods;
import com.jkslw.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("GoodsService")

public class GoodsServiceImpl  implements GoodsService {


    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<Map> getGoods() {

        return goodsDao.getGoods();
    }

    @Override
    public List<Map<String, Object>> getGoodslIst() {
        return goodsDao.getGoodslIst();
    }

    @Override
    public List<Map<String, Object>> getGoodsGroupList() {
        return goodsDao.getGoodsGroupList();
    }

    @Override
    public List<Map<String, Object>> getGoodsAdlIst() {
        return goodsDao.getGoodsAdlIst();
    }

//    public List<Map> updateGoods(){
//        return goodsDao.updateGoods();
//    }


}
