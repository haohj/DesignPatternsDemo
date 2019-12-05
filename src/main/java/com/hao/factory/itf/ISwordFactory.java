package com.hao.factory.itf;

import com.hao.factory.model.AbstractSword;

/**
 * @description: 宝刀工厂
 * @author: haohj
 * @create: 2019-08-02 13:47
 **/
public interface ISwordFactory {
    //生产各类宝刀
    public AbstractSword createSword();
}
