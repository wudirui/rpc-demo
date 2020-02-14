package com.zr.rpc.server;


import com.zr.rpc.server.rpc.RpcServerFrame;
import com.zr.rpc.service.SendSms;
import com.zr.rpc.service.impl.SendSmsImpl;

/**
 *@author super rui
 *
 *类说明：rpc的服务端，提供服务
 */
public class SmsRpcServer {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                try{
                    RpcServerFrame serviceServer = new RpcServerFrame(9189);
                    serviceServer.registerSerive(SendSms.class.getName(),
                    		SendSmsImpl.class);
                    serviceServer.startService();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
