package com.zr.rpc.service.impl;


import com.zr.rpc.service.SendSms;
import com.zr.rpc.vo.UserInfo;

/**
 *@author super rui
 *
 *类说明：短信息发送服务的实现
 */
public class SendSmsImpl implements SendSms {

    @Override
    public boolean sendMail(UserInfo user) {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("已发送短信息给："+user.getName()+"到【"+user.getPhone()+"】");
        return true;
    }
}
