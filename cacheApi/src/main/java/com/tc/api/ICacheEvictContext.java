package com.tc.api;

/**
 * 淘汰策略
 *
 * @param <K>
 * @param <V>
 */
public interface ICacheEvictContext<K, V>{
    /**
     * 新增key
     * @return
     */
    K key();

    /**
     * cache实现
     * @return
     */
    ICache<K, V> cache();

    /**
     * 获取大小
     * @return
     */
    int size();
}
