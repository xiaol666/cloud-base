package cn.xiaol.common.utils;


import java.util.UUID;

public class UuidUtil {
    public UuidUtil() {
    }

    public static String get32UUID() {
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid;
    }

    public static String get8UUID() {
        UUID id = UUID.randomUUID();
        String[] idd = id.toString().split("-");
        return idd[0];
    }
}