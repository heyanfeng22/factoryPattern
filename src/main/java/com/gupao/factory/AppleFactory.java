package com.gupao.factory;

import com.gupao.Apple;
import com.gupao.Fruit;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/10 13:04
 * @Modified By:
 */
public class AppleFactory implements FruitFactory
{

    public Fruit getFruit()
    {
        return new Apple();
    }
}
