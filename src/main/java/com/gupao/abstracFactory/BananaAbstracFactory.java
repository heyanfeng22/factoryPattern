package com.gupao.abstracFactory;

import com.gupao.Banana;
import com.gupao.Fruit;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/10 15:07
 * @Modified By:
 */
public class BananaAbstracFactory implements AbstracFactory
{
    public Fruit getFruit()
    {
        return new Banana();
    }

    public Milk getMilk()
    {
        return new BananaMilk();
    }
}
