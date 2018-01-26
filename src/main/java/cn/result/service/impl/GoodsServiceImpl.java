package cn.result.service.impl;

import base.BaseServiceImpl;
import cn.result.dao.mapper.GoodsMapper;
import cn.result.dao.model.Goods;
import cn.result.dao.model.GoodsExample;
import cn.result.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* GoodsService实现
* Created by jiehuang on 2018/1/26.
*/
@Service
@Transactional
public class GoodsServiceImpl extends BaseServiceImpl<GoodsMapper, Goods, GoodsExample> implements GoodsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GoodsServiceImpl.class);

    @Autowired
    GoodsMapper goodsMapper;

}