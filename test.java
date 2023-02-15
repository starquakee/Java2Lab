import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.Boolean.*;

public class test {

    private static boolean isNum(String str) {
        try {
            int a=Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    private static boolean isBool(String str) {
        try {
            boolean a= parseBoolean(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static Boolean valueOf(String s) {
        return parseBoolean(s) ? TRUE : FALSE;
    }


    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(11);
        System.out.println(set);

        System.out.println(Boolean.parseBoolean("True"));
    }
}
