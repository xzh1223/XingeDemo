package com.xzh.demo;

import com.tencent.xinge.*;

/**
 * Created by zhenghangxia on 17-5-4.
 */
public class TestDemo {

    public static void main(String[] args) {
        demoXingeSimple();
    }

    /**
     * 调用简易接口
     */
    public static void demoXingeSimple() {
        // 易用接口
        System.out.println(XingeApp.pushTokenAndroid(2100258024, "bc6b92ce54ebde0797581567874222e6",
                "test", "推送消息给单个设备\n", "5569c6ecc4e2ccaf483d89bcfb37bf28bd07cb32"));
        System.out.println(XingeApp.pushAccountAndroid(2100258024, "bc6b92ce54ebde0797581567874222e6",
                "test", "推送消息给单个账号\n", "admin"));
    }



}
