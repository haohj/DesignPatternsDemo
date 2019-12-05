package com.hao.factory.model;

/**
 * @description: 抽象宝刀
 * @author: haohj
 * @create: 2019-08-02 13:47
 **/
public abstract class AbstractSword {
    //宝刀的名称
    private String name;

    //抽象父类的构造方法
    public AbstractSword() {
    }

    //获取宝刀名称
    public String getName() {
        return name;
    }

    //设置宝刀名称
    public void setName(String name) {
        this.name = name;
    }
}
