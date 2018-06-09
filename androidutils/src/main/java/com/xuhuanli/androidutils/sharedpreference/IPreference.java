package com.xuhuanli.androidutils.sharedpreference;

import android.content.Context;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The interface Preference.
 */
public interface IPreference {

    /**
     * The constant prefHolder.
     */
    IPreferenceHolder prefHolder = new IPreferenceHolder();

    /**
     * IPreference的持有类
     */
    class IPreferenceHolder {
        /**
         * 获得一个新创建的IPreference对象
         *
         * @param context  上下文对象
         * @param fileName 文件名
         * @return preference preference
         */
        public IPreference newPreference(Context context, String fileName) {
            return new PreferenceImpl(context, fileName);
        }

        /**
         * 获取一个IPreference对象
         *
         * @param context 上下文对象
         * @return preference preference
         */
        public IPreference getPreference(Context context) {
            return PreferenceImpl.getPreference(context);
        }

        /**
         * 获取一个IPreference对象
         *
         * @param context  上下文对象
         * @param fileName 文件名
         * @return preference preference
         */
        public IPreference getPreference(Context context, String fileName) {
            return PreferenceImpl.getPreference(context, fileName);
        }
    }

    /**
     * 保存一个数据
     *
     * @param <T>   the type parameter
     * @param key   键
     * @param value 值
     */
    <T> void put(String key, T value);

    /**
     * 保存一个Map集合
     *
     * @param <T> the type parameter
     * @param map the map
     */
    <T> void putAll(Map<String, T> map);

    /**
     * 保存一个List集合
     *
     * @param key  the key
     * @param list the list
     */
    void putAll(String key, List<String> list);

    /**
     * 保存一个List集合，并且自定保存顺序
     *
     * @param key        the key
     * @param list       the list
     * @param comparator the comparator
     */
    void putAll(String key, List<String> list, Comparator<String> comparator);

    /**
     * 根据key取出一个数据
     *
     * @param <T>  the type parameter
     * @param key  键
     * @param type the type
     * @return the t
     */
    <T> T get(String key, DataType type);

    /**
     * 取出全部数据
     *
     * @return the all
     */
    Map<String, ?> getAll();

    /**
     * 取出一个List集合
     *
     * @param key the key
     * @return all
     */
    List<String> getAll(String key);

    /**
     * 移除一个数据
     *
     * @param key the key
     * @return
     */
    void remove(String key);

    /**
     * 移除一个集合的数据
     *
     * @param keys the keys
     * @return
     */
    void removeAll(List<String> keys);

    /**
     * 移除一个集合的数据
     *
     * @param keys the keys
     * @return
     */
    void removeAll(String[] keys);

    /**
     * 是否存在key
     *
     * @param key the key
     * @return boolean
     */
    boolean contains(String key);

    /**
     * 清除全部数据
     */
    void clear();

    /**
     * 获取String类型的数据
     *
     * @param key the key
     * @return string
     */
    String getString(String key);

    /**
     * 获取Float类型的数据
     *
     * @param key the key
     * @return float
     */
    float getFloat(String key);

    /**
     * 获取int类型的数据
     *
     * @param key the key
     * @return integer
     */
    int getInteger(String key);

    /**
     * 获取long类型的数据
     *
     * @param key the key
     * @return long
     */
    long getLong(String key);

    /**
     * 获取Set类型的数据
     *
     * @param key the key
     * @return set
     */
    Set<String> getSet(String key);

    /**
     * 获取boolean类型的数据
     *
     * @param key the key
     * @return boolean
     */
    boolean getBoolean(String key);

    /**
     * 枚举：存储或取出的数据类型
     */
    enum DataType {
        /**
         * Integer data type.
         */
        INTEGER, /**
         * Long data type.
         */
        LONG, /**
         * Boolean data type.
         */
        BOOLEAN, /**
         * Float data type.
         */
        FLOAT, /**
         * String data type.
         */
        STRING, /**
         * String set data type.
         */
        STRING_SET
    }
}
