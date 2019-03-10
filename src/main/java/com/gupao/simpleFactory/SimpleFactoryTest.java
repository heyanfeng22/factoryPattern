package com.gupao.simpleFactory;

import com.gupao.Apple;
import com.gupao.Fruit;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/10 13:00
 * @Modified By:
 */
public class SimpleFactoryTest
{
    public static void main(String[] args)
    {
        FruitFactory factory = new FruitFactory();
        Fruit apple = factory.getFruit("apple");
        Fruit banana = factory.getFruit("banana");

        apple.eat();
        banana.eat();
    }
}
