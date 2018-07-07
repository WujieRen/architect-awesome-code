import java.text.Collator;
import java.util.*;

/**
 * Created by renwujie on 2018/05/25 at 18:13
 *
 * reference: https://baike.xsoftlab.net/view/250.html#paragraph_4
 */
public class TestStringSort {

    public static void main(String[] args){
        //test1();
        //test2();
        //test3();
        //test4();
        System.out.println(new Date());
    }
    static void test1(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Y-一鸣惊人-Y");
        list.add("R-人山人海-R");
        list.add("H-海阔天空-H");
        list.add("K-空前绝后-K");
        list.add("H-后来居上-H");
        Collections.sort(list);
        System.out.println("Collections.sort------------->");
        for(String str : list) {
            System.out.println(str);
        }
    }
    static void test2(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("一鸣惊人-Y");
        list.add("人山人海-R");
        list.add("海阔天空-H");
        list.add("空前绝后-K");
        list.add("后来居上-H");
        list.add("Y-一鸣惊人-Y");
        list.add("R-人山人海-R");
        list.add("H-海阔天空-H");
        list.add("K-空前绝后-K");
        list.add("H-后来居上-H");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("String.compareTO()--------------->>");
        for(String str : list) {
            System.out.println(str);
        }
    }

    static void test3(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("一鸣惊人-Y");
        list.add("人山人海-R");
        list.add("海阔天空-H");
        list.add("空前绝后-K");
        list.add("后来居上-H");
        list.add("Y-一鸣惊人-Y");
        list.add("R-人山人海-R");
        list.add("H-海阔天空-H");
        list.add("K-空前绝后-K");
        list.add("H-后来居上-H");
        Comparator<Object> selfComparator = Collator.getInstance(Locale.CHINA);
        Collections.sort(list, selfComparator);
        System.out.println("Locale.China----------->>>");
        for(String str : list) {
            System.out.println(str);
        }
    }

    static void test4() {
        String str1 = "任武杰";
        System.out.println(str1.toCharArray());
        System.out.println(str1.toCharArray().length);
    }
}
