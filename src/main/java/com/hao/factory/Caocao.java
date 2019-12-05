package com.hao.factory;

import com.hao.factory.itf.ISwordFactory;
import com.hao.factory.model.AbstractSword;
import com.hao.factory.model.object.QixingSword;

/**
 * @description: 曹操
 * @author: haohj
 * @create: 2019-08-02 13:57
 **/
public class Caocao implements ISwordFactory {
    @Override
    public AbstractSword createSword() {
        return new QixingSword();
    }
}
