package com.xuhuanli.androidutils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Eally_x64 on 2017-05-20.
 */

public class MD5Util {
    //盐
    public static String salt="$XuHuanLi2017$";

    /**
     * 对保存的密码进行MD5存储
     * @param psd
     * @return
     */
    public static String encoder(String psd){
        try {
            psd=psd+salt;
            //指定MD5加密
            MessageDigest digest = MessageDigest.getInstance("MD5");
            //需要加密的内容转换成byte[]，进行随机哈希过程
            byte[] bytes = digest.digest(psd.getBytes());
            StringBuffer sb =new StringBuffer();
            for (byte b :
                    bytes) {
                int i= b&0xff;
                String hexString = Integer.toHexString(i);
                if(hexString.length()<2){
                    hexString="0"+hexString;
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
