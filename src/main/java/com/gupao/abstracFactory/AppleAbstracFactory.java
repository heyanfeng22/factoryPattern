package com.gupao.abstracFactory;

import com.gupao.Apple;
import com.gupao.Fruit;

/**
 * @Autor : heyanfeng22
 * @Description : 苹果厂商
 * @Date:Create:in 2019/3/10 15:06
 * @Modified By:
 */
public class AppleAbstracFactory implements AbstracFactory
{
    public Milk getMilk()
    {
        return new AppleMilk();
    }

    public Fruit getFruit()
    {
        return new Apple();
    }
}
