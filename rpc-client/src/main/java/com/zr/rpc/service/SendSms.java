package com.zr.rpc.service;


import com.zr.rpc.vo.UserInfo;

/**
 * @author super rui
 *
 * 类说明：短信息发送接口
 */
public interface SendSms {

	boolean sendMail(UserInfo user);

}
