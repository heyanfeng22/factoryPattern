package com.gupao.simpleFactory;

import com.gupao.Apple;
import com.gupao.Banana;
import com.gupao.Fruit;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/10 12:57
 * @Modified By:
 */
public class FruitFactory
{
    public Fruit getFruit(String name)
    {
        if("apple".equals(name))
        {
            return new Apple();
        }
        else if("banana".equals(name))
        {
            return  new Banana();
        }

        return null;
    }

}
