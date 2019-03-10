package com.gupao.factoryMethod;

import com.gupao.Fruit;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/10 13:07
 * @Modified By:
 */
public class FactoryTest
{
    public static void main(String[] args)
    {
        Fruit apple = new AppleFactory().getFruit();
        Fruit banana = new BananaFactory().getFruit();

        apple.eat();
        banana.eat();
    }
}
