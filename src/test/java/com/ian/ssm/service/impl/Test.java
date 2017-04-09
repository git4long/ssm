package com.ian.ssm.service.impl;

import com.clg.infra.generation.GenerationFactory;
import com.clg.infra.generation.GenerationParam;

/**
 * Created by Administrator on 2017/4/9.
 */
public class Test {

    @org.junit.Test
    public void test() {
        // 单张表
        GenerationParam param = new GenerationParam("ssm", "user", "plt_user", "用户信息");
        GenerationFactory.generationClassFile(param);
    }
}
