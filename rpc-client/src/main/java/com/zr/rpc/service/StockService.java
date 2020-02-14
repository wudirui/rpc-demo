package com.zr.rpc.service;

/**
 * @author super rui
 *
 *类说明：变动库存服务接口
 */
public interface StockService {
    void addStock(String goodsId, int addAmout);
    void deduceStock(String goodsId, int deduceAmout);
}
