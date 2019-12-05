package com.hao.factory.model;

import com.hao.factory.itf.IFood;

/**
 * @description: 汉堡基类
 * @author: haohj
 * @create: 2019-08-02 14:14
 **/
public abstract class Hamburg extends AbstractBaseFood implements IFood {
    @Override
    public void printMesage() {
        System.out.println("--" + this.kind + "风味汉堡，\t单价：" + this.price + "，\t数量：" + this.num + "，\t合计：" + this.totalPrice());
    }
}
