package com.luohao;

import com.luohao.inter.DemoInterface;

/**
 * This is Description
 *
 * @author luohao
 * @date 2019/11/15
 */
public class server implements DemoInterface {
    @Override
    public void test() {
        System.out.println(1);
    }
}
