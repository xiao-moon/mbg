package com.moon.utils;

import java.util.Collection;

/**
 * @since 1.0-SNAPSHOT
 * @author 小月
 */
public class CollectionUtils {

	/**
	 * 判断集合是否为空
	 */
	public static boolean isNotEmpty(Collection<?> c) {
		return c != null && c.size() > 0;
	}

}
