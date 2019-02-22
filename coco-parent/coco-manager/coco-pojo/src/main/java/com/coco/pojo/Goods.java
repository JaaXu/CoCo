package com.coco.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {
    private Integer id;

    private Integer kindId;

    private Integer shopId;

    private String name;

    private String subtitle;

    private BigDecimal price;

    private Integer num;

    private Integer status;

    private Integer topShow;

    private Date createTime;

    private Date updateTime;

    private String detail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKindId() {
        return kindId;
    }

    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTopShow() {
        return topShow;
    }

    public void setTopShow(Integer topShow) {
        this.topShow = topShow;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", kindId=" + kindId +
                ", shopId=" + shopId +
                ", name='" + name + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", status=" + status +
                ", topShow=" + topShow +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", detail='" + detail + '\'' +
                '}';
    }
}