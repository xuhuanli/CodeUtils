package com.xuhuanli.androidutils.md5;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * The type Md 5 util.
 */
public class MD5Util {

    private static final String SALT = "$XuHuanLi2017$";

    /**
     * Encode string.
     *
     * @param str  the str
     * @param salt the salt
     * @return the string
     */
    public static String encode(@NonNull String str, @Nullable String salt) {
        if (salt == null) {
            salt = SALT;
        }
        try {
            str = str + salt;
            //指定MD5加密
            MessageDigest digest = MessageDigest.getInstance("MD5");
            //需要加密的内容转换成byte[]，进行随机哈希过程
            byte[] bytes = digest.digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b :
                    bytes) {
                int i = b & 0xff;
                String hexString = Integer.toHexString(i);
                if (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}
