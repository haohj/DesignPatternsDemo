package com.hao.factory;

import com.hao.factory.itf.ISwordFactory;
import com.hao.factory.model.AbstractSword;

/**
 * @description:
 * @author: haohj
 * @create: 2019-08-02 13:59
 **/
public class MainApp {
    public static void main(String[] args) {
        //ISwordFactory swordFactory = new Caocao();
        ISwordFactory swordFactory = new Caocao2();
        AbstractSword sword = swordFactory.createSword();
        System.out.println("曹操使用" + sword.getName() + "刺杀董卓！");
    }
}
