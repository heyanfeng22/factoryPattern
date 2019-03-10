package com.gupao.factoryMethod;

import com.gupao.Banana;
import com.gupao.Fruit;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/10 13:06
 * @Modified By:
 */
public class BananaFactory implements FruitFactory
{
    public Fruit getFruit()
    {
        return new Banana();
    }
}
