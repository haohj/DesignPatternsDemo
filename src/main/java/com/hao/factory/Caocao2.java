package com.hao.factory;

import com.hao.factory.itf.ISwordFactory;
import com.hao.factory.model.AbstractSword;
import com.hao.factory.model.object.BaxingSword;

/**
 * @description:
 * @author: haohj
 * @create: 2019-08-02 14:04
 **/
public class Caocao2 implements ISwordFactory {
    @Override
    public AbstractSword createSword() {
        return new BaxingSword();
    }
}
