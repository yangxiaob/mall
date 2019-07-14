package com.mall.shopping.pojo;

import java.util.Date;

public class MallCar {
    private Integer id;

    private Integer userId;

    private Integer productId;

    private Integer quantity;

    private Integer cheched;

    private Date createTime;

    private Date updateTime;

    public MallCar(Integer id, Integer userId, Integer productId, Integer quantity, Integer cheched, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.cheched = cheched;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public MallCar() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getCheched() {
        return cheched;
    }

    public void setCheched(Integer cheched) {
        this.cheched = cheched;
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
}