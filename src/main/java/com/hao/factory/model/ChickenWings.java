package com.hao.factory.model;

import com.hao.factory.itf.IFood;

/**
 * @description: 鸡翅基类
 * @author: haohj
 * @create: 2019-08-02 14:23
 **/
public abstract class ChickenWings extends AbstractBaseFood implements IFood {
    @Override
    public void printMesage() {
        System.out.println("--" + this.kind + "风味鸡翅，\t单价：" + this.price + "，\t数量：" + this.num + "，\t合计：" + this.totalPrice());
    }
}
