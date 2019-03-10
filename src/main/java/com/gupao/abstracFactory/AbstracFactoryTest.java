package com.gupao.abstracFactory;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/10 15:05
 * @Modified By:
 */
public class AbstracFactoryTest
{
    public static void main(String[] args)
    {
        AbstracFactory apple = new AppleAbstracFactory();
        AbstracFactory banana = new BananaAbstracFactory();

        apple.getFruit().eat();
        apple.getMilk().drink();

        banana.getFruit().eat();
        banana.getMilk().drink();
    }
}
