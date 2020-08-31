package com.zmzhou.server.utils;

import lombok.extern.slf4j.Slf4j;

import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

/**
 * @author zmzhou
 * @description 工具类
 * @date 2020/07/02 16:52
 */
@Slf4j
public final class ServerUtils {
	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 私有构造器
	 * @author zmzhou
	 * @date 2020/08/29 14:18
	 */
	private ServerUtils() {
	}

	/**
	 * 获取当前Date型日期
	 *
	 * @return Date() 当前日期
	 */
	public static Date now() {
		return new Date();
	}
	/**
	 * Gets host ip.
	 * 获取主机IP
	 * @return the host ip
	 */
	public static String getHostIp() {
		try {
			return InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			log.error("获取IP地址异常", e);
		}
		return "127.0.0.1";
	}

	/**
	 * Gets host name.
	 * 获取主机名
	 * @return the host name
	 */
	public static String getHostName() {
		try {
			return InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			log.error("获取主机名异常", e);
		}
		return "未知";
	}
	/**
	 * 获取服务器启动时间
	 * @return Date
	 * @author zmzhou
	 * @date 2020/08/29 14:31
	 */
	public static Date getServerStartDate() {
		long time = ManagementFactory.getRuntimeMXBean().getStartTime();
		return new Date(time);
	}
	
	/**
	 * 计算两个时间差
	 * @author zmzhou
	 * @date 2020/08/29 14:31
	 */
	public static String getDatePoor(Date endDate, Date nowDate) {
		long nm = 1000L * 60;
		long nh = nm * 60;
		long nd = nh * 24;
		// long ns = 1000
		// 获得两个时间的毫秒时间差异
		long diff = endDate.getTime() - nowDate.getTime();
		// 计算差多少天
		long day = diff / nd;
		// 计算差多少小时
		long hour = diff % nd / nh;
		// 计算差多少分钟
		long min = diff % nd % nh / nm;
		// 计算差多少秒//输出结果
		// long sec = diff % nd % nh % nm / ns
		return day + "天" + hour + "小时" + min + "分钟";
	}
}