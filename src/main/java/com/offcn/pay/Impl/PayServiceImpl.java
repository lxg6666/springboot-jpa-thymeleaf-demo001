package com.offcn.pay.Impl;

import com.offcn.pay.PayService;

import java.util.Map;

public class PayServiceImpl implements PayService {
    @Override
    public void createNative(String out_trade_no, String price) {
        System.out.println("预下单方法");
    }

    @Override
    public Map queryStatus(String out_trade_no) {
        System.out.println("查询交易状态代码");
        return null;
    }
}
