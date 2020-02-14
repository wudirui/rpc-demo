package com.zr.rpc.server;


import com.zr.rpc.server.rpc.RpcServerFrame;
import com.zr.rpc.service.StockService;
import com.zr.rpc.service.impl.StockServiceImpl;

/**
 * @author super rui
 * <p>
 * 类说明：rpc的服务端，提供服务
 */
public class StockRpcServer {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				try {
					RpcServerFrame serviceServer = new RpcServerFrame(9190);
					serviceServer.registerSerive(
							StockService.class.getName(),
							StockServiceImpl.class);
					serviceServer.startService();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
}
