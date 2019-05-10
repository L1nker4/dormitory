package wang.l1n.dormitory.utils;

import java.util.UUID;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/5/2 17:08
 * @description：
 */
public class UUIDUtils {
    /**
     *
     * @return
     */
    public static String getUUID(){
        UUID uuid = UUID.randomUUID();
        String string = uuid.toString();
        string = string.substring(0,11);
        string = string.replace("-", "w");
        return string;
    }
}
