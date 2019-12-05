package com.hao.factory.model;

/**
 * @description: 抽象食物基类
 * @author: haohj
 * @create: 2019-08-02 14:07
 **/
public abstract class AbstractBaseFood {
    //类别
    protected String kind;
    //数量
    protected int num;
    //价格
    protected float price;

    //合计
    public float totalPrice() {
        return this.num * this.price;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
