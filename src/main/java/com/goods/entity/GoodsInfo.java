package com.goods.entity;

import java.util.Date;

/**
 * 商品实体类
 * @Description goods
 * @Author kaoxin
 * @Date 2020-03-26
 */
public class GoodsInfo {
    /**
     * 页码
     */
    private int pageSize;
    /**
     * 页数
     */
    private int pageNum;
    /**
     * 商品编号
     */
    public String commodityId;
    /**
     * 商品名称
     */
    public String commodityName;
    /**
     * 商品定价
     */
    public String price;
    /**
     * 商品售价
     */
    public String sellingPrice;
    /**
     * 销售量
     */
    public String salesVolume;
    /**
     * 一级分类
     */
    public String classificationOne;
    /**
     * 二级分类
     */
    public String classificationTwo;
    /**
     * 广告词
     */
    public String advertisingWords;
    /**
     * 商品介绍
     */
    public String commodityIntroduce;
    /**
     * 作者
     */
    public String author;
    /**
     * 商品状态0在售1已下架2未发布
     */
    public int commodityState;
    /**
     * 出版社
     */
    public String press;
    /**
     * ins书号
     */
    public String IsbnBook;
    /**
     * 商家名称
     */
    public String nameOfMerchant;
    /**
     * 库存
     */
    public int goodsSalesVolume;
    /**
     * 删除标记0未删除1已删除
     */
    public String deleteTag;
    /**
     * 创建时间
     */
    public String creationTime;
    /**
     * 创建人
     */
    public String creator;
    /**
     * 修改时间
     */
    public String modificationTime;
    /**
     * 修改人
     */
    public String modifier;
    /**
     * 版本号
     */
    public String versionNumber;
    /**
     * 图片地址
     */
    public String image;


    /**
     * 以下是构造方法
     * @return
     */
    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getPageNum() {
        return pageNum;
    }
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(String salesVolume) {
        this.salesVolume = salesVolume;
    }

    public String getClassificationOne() {
        return classificationOne;
    }

    public void setClassificationOne(String classificationOne) {
        this.classificationOne = classificationOne;
    }

    public String getClassificationTwo() {
        return classificationTwo;
    }

    public void setClassificationTwo(String classificationTwo) {
        this.classificationTwo = classificationTwo;
    }

    public String getAdvertisingWords() {
        return advertisingWords;
    }

    public void setAdvertisingWords(String advertisingWords) {
        this.advertisingWords = advertisingWords;
    }

    public String getCommodityIntroduce() {
        return commodityIntroduce;
    }

    public void setCommodityIntroduce(String commodityIntroduce) {
        this.commodityIntroduce = commodityIntroduce;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCommodityState() {
        return commodityState;
    }

    public void setCommodityState(int commodityState) {
        this.commodityState = commodityState;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getIsbnBook() {
        return IsbnBook;
    }

    public void setIsbnBook(String isbnBook) {
        IsbnBook = isbnBook;
    }

    public String getNameOfMerchant() {
        return nameOfMerchant;
    }

    public void setNameOfMerchant(String nameOfMerchant) {
        this.nameOfMerchant = nameOfMerchant;
    }

    public int getGoodsSalesVolume() {
        return goodsSalesVolume;
    }

    public void setGoodsSalesVolume(int goodsSalesVolume) {
        this.goodsSalesVolume = goodsSalesVolume;
    }

    public String getDeleteTag() {
        return deleteTag;
    }

    public void setDeleteTag(String deleteTag) {
        this.deleteTag = deleteTag;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
}