package cn.result.service;

import base.BaseServiceMock;
import cn.result.dao.mapper.GoodsMapper;
import cn.result.dao.model.Goods;
import cn.result.dao.model.GoodsExample;

/**
* 降级实现GoodsService接口
* Created by jiehuang on 2018/1/26.
*/
public class GoodsServiceMock extends BaseServiceMock<GoodsMapper, Goods, GoodsExample> implements GoodsService {

}
