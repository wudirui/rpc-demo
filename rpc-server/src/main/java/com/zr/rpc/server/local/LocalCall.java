package com.zr.rpc.server.local;


import com.zr.rpc.service.NormalBusi;
import com.zr.rpc.service.SendSms;
import com.zr.rpc.service.StockService;
import com.zr.rpc.service.impl.SendSmsImpl;
import com.zr.rpc.service.impl.StockServiceImpl;
import com.zr.rpc.vo.UserInfo;

/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：本地方法调用的实现
 */
public class LocalCall {

    public static void main(String[] args) {

        NormalBusi normalBusi = new NormalBusi();
        normalBusi.business();

        StockService stockService = new StockServiceImpl();
        stockService.addStock("A001",1000);
        stockService.deduceStock("B002",50);
        //this.methodnam();
        
        SendSms sendSms = new SendSmsImpl();
        UserInfo userInfo = new UserInfo("Mark","Mark@xiangxue.com");
        System.out.println("Send mail: "+ sendSms.sendMail(userInfo));

    }

}
