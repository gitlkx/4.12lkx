package com.goods.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.goods.dao.GoodsDao;
import com.goods.entity.GoodsInfo;
import com.util.AppResponse;
import com.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
/**
 * @author xin
 */
@Service
public class GoodsService {
    @Resource
    private GoodsDao goodsDao;

    /**
     * goods 新增商品
     * @param goodsInfo
     * @return
     * @Author kaoxin
     * @Date 2020-03-27
     */
    /**
     * @Transactional(rollbackFor = Exception.class)
     * 数据回滚，防止脏数据.用于新增修改删除
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addGoods(GoodsInfo goodsInfo) {
        // 校验账号是否存在
        int countGoods = goodsDao.countGoods(goodsInfo);
        if(0 != countGoods) {
            return AppResponse.bizError("用户商品已存在，请重新输入！");
        }
        goodsInfo.setCommodityId(StringUtil.getCommonCode(2));
        goodsInfo.setGoodsSalesVolume(0);
        // 新增用户
        int count = goodsDao.addGoods(goodsInfo);
        if(0 == count) {
            return AppResponse.bizError("新增失败，请重试！");
        }
        return AppResponse.success("新增成功！");
    }

    /**
     * goods 分页查询商品
     * @param goodsInfo
     * @Author kaoxin
     * @time 2020-03-30
     */
    public AppResponse listGoods(GoodsInfo goodsInfo) {
        PageHelper.startPage(goodsInfo.getPageNum(), goodsInfo.getPageSize());
        List<GoodsInfo> goodsInfoList = goodsDao.listGoodsByPage(goodsInfo);
        // 包装Page对象
        PageInfo<GoodsInfo> pageData = new PageInfo<GoodsInfo>(goodsInfoList);
        return AppResponse.success("查询成功！",pageData);
    }

    /**
     * goods 删除商品
     * @param commodityId
     * @param userId
     * @return
     * @Author kaoxin
     * @Date 2020-04-10
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteGoods(String commodityId,String userId) {
        List<String> listGoods= Arrays.asList(commodityId.split(","));
        AppResponse appResponse = AppResponse.success("删除成功！");
        // 删除用户
        int count = goodsDao.deleteGoods(listGoods,userId);
        if(0 == count) {
            appResponse = AppResponse.bizError("删除失败，请重试！");
        }
        return appResponse;
    }

    /**
     * goods 修改商品
     * @param goodsInfo
     * @return
     * @Author kaoxin
     * @Date 2020-04-10
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateGoods(GoodsInfo goodsInfo) {
        AppResponse appResponse = AppResponse.success("修改成功");
        // 校验账号是否存在
        int countGoods = goodsDao.countGoods(goodsInfo);
        if(0 != countGoods) {
            return AppResponse.bizError("用户账号已存在，请重新输入！");
        }
        // 修改用户信息
        int count = goodsDao.updateGoods(goodsInfo);
        if (0 == count) {
            appResponse = AppResponse.versionError("数据有变化，请刷新！");
            return appResponse;
        }
        return appResponse;
    }
    /**
     * goods 上下架商品
     * @param commodityId
     * @param commodityState
     * @return
     * @Author dingning
     * @Date 2020-03-21
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse upDowGoods(String commodityId,int commodityState) {
        List<String> listGoods= Arrays.asList(commodityId.split(","));
        AppResponse appResponse = AppResponse.success("上下架成功！");
        // 上下架
        int count = goodsDao.upDowGoods(listGoods,commodityState);
        if(0 == count) {
            appResponse = AppResponse.bizError("上下架失败，请重试！");
        }
        return appResponse;
    }

    /**
     * goods 查询商品详情
     * @param commodityId
     * @Author kaoxin
     * @Date 2020-04-10
     */
    public AppResponse detailsGoods(String commodityId) {
        GoodsInfo goodsInfo = goodsDao.detailsGoods(commodityId);
        return AppResponse.success("查询成功！",goodsInfo);
    }
}