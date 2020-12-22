package com.test.date.list;

import java.security.MessageDigest;

/**
 * @ClassName MD5Utils
 * @Description TODO
 * @Author bianliang
 * @Date 2020/1/8 21:53
 * @Version 1.0
 */

public class MD5Utils {

    //这里主要是遍历8个byte，转化为16位进制的字符，即0-F
    private static String byteArrayToHexString(byte b[]) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++)
            resultSb.append(byteToHexString(b[i]));

        return resultSb.toString();
    }
     private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0)
            n += 256;
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    /**
     * 返回大写MD5
     *
     * @param origin
     * @return
     */
    private static String MD5Encode(String origin) {
        String resultString = null;
        try {
            resultString = new String(origin);
            MessageDigest md = MessageDigest.getInstance("MD5");
            resultString = byteArrayToHexString(md.digest(resultString.getBytes()));

        } catch (Exception exception) {
        }
        return resultString.toLowerCase();
    }




    private static final String hexDigits[] = {"0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};


    public static void main(String[] args){
        String s1 = MD5Utils.MD5Encode("123");
        String s2 = MD5Utils.MD5Encode("123");

        System.out.println(s1);
        System.out.println(s2);
    }
}

