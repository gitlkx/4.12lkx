/**
 * 数据库相关接口
 */
package com.goods.dao;
import com.goods.entity.GoodsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName goodsDao
 * @Description goods
 * @Author kaoxin
 * @Date 2020-03-26
 */
/**
 * @author xin
 * @Mapper 与数据库相关联的意思
 */
@Mapper

public interface GoodsDao {
    /**
     * 新增商品
     * @param goodsInfo
     * @return
     */
    int addGoods(GoodsInfo goodsInfo);
    /**
     * 计算商品数量
     * @param goodsInfo
     * @return 返回商品个数
     */
    int countGoods(GoodsInfo goodsInfo);
    /**
     * 获取所有商品信息
     * @param goodsInfo 用户信息
     * @return 所有用户信息
     */
    List<GoodsInfo> listGoodsByPage(GoodsInfo goodsInfo);
    /**
     * 删除商品信息
     * @param listGoods 选中的商品编号集合
     * @param userId 更新人
     * @return
     */
    int deleteGoods(List<String> listGoods,@Param("userId") String userId);
    /**
     * 修改用户信息
     * @param goodsInfo 商品信息
     * @return 修改结果
     */
    int updateGoods(GoodsInfo goodsInfo);
    /**
     * 商品上下架
     * @param listGoods 选中的商品编号集合
     * @param commodityState 0上架1下架
     * @return
     */
    int upDowGoods(List<String> listGoods, int commodityState);
    /**
     * 获取商品详细信息
     * @param commodityId 商品id
     * @return 商品详细详细
     */
    GoodsInfo detailsGoods( String commodityId);
}
