package com.goods.controller;
import com.goods.entity.GoodsInfo;
import com.goods.service.GoodsService;
import com.util.AppResponse;
import com.util.AuthUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 商品管理
 * @author kaoxin
 * @time 2020-03-24
 */

@Service
@RestController
@RequestMapping("/goods")
public class GoodsController {

    private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);

    @Resource
    private GoodsService goodsService;
    /**
     * 新增商品
     * @return AppResponse
     * @author kaoxin
     * @Date 2020-04-09
     */
    @PostMapping("addGoods")
    public AppResponse addGoods(GoodsInfo goodsInfo) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            goodsInfo.setModifier(userId);
            AppResponse appResponse = goodsService.addGoods(goodsInfo);
            return appResponse;
        } catch (Exception e) {
            logger.error("商品新增失败", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * 分页查询商品列表
     *
     * @param goodsInfo
     * @return
     */
    @RequestMapping(value = "listGoods")
    public AppResponse listGoods(GoodsInfo goodsInfo) {
        try {
            return goodsService.listGoods(goodsInfo);
        } catch (Exception e) {
            logger.error("查询商品列表异常", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * demo 删除用户
     * @param commodityId
     * @return AppResponse
     * @author dingning
     * @Date 2020-03-21
     */
    @PostMapping("deleteGoods")
    public AppResponse deleteGoods(String commodityId) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            return goodsService.deleteGoods(commodityId,userId);
        } catch (Exception e) {
            logger.error("商品删除错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }

    /**
     * demo 修改用户
     * @param goodsInfo
     * @return AppResponse
     * @author kaoxin
     * @Date 2020-04-10
     */
    @PostMapping("updateGoods")
    public AppResponse updateGoods(GoodsInfo goodsInfo) {
        try {
            //获取用户id
            String userId = AuthUtils.getCurrentUserId();
            goodsInfo.setCreator(userId);
            goodsInfo.setModifier(userId);
            return goodsService.updateGoods(goodsInfo);
        } catch (Exception e) {
            logger.error("修改商品信息错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    @PostMapping("upDowGoods")
    public AppResponse upDowGoods(String commodityId,int commodityState) {
        try {
            return goodsService.upDowGoods(commodityId,commodityState);
        } catch (Exception e) {
            logger.error("上下架错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
    /**
     * goods 查询商品详情
     * @param commodityId
     * @return
     * @Author kaoxin
     * @Date 2020-04-11
     */
    @RequestMapping(value = "detailsGoods")
    public AppResponse detailsGoods(String commodityId) {
        try {
            return goodsService.detailsGoods(commodityId);
        } catch (Exception e) {
            logger.error("商品详情查询错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}