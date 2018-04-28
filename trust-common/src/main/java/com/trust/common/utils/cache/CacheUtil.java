package com.trust.common.utils.cache;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author 唐亮
 * @create 2018-02-28 16:14
 * @desc 缓存工具类
 **/
public class CacheUtil {

    private static final CacheUtil ME = new CacheUtil();

    private static final Map<String, Map<String,Object>> CACHE = Maps.newHashMap();

    private CacheUtil() {
    }

    /**
     * 取缓存对象
     *
     * @return
     */
    public static CacheUtil getInstance() {
        return ME;
    }

    /**
     * 保存
     *  @param key
     * @param value
     */
    public void put(String key, Map<String,Object> value) {
        CACHE.put(key, value);
    }

    /**
     * 取值
     *
     * @param key
     * @return
     */
    public Object get(String key) {
        return CACHE.get(key);
    }

    /**
     * key是否存在
     *
     * @param key
     * @return
     */
    public boolean contains(String key) {
        return CACHE.containsKey(key);
    }

    /**
     * 删除
     *
     * @param key
     * @return
     */
    public Object remove(String key) {
        return CACHE.remove(key);
    }
}
