/**
 * Created by renwujie on 2018/05/25 at 18:28
 *
 * 测试结论：for循环中++i效率比i++高（也和i的数据类型有关，有的说没区别，反正++顺序不重要的情况下用++i就好了。）
 *  reference: https://blog.csdn.net/github_37847975/article/details/77369851
 */
public class TestForLoopTimeConsuming {
    public static void main(String[] args){
        test1();
        System.gc();
        test2();
    }

    static void test1() {
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000000; i++) {
            String s = "s";
            s += 1;
        }
        long end = System.currentTimeMillis();
        System.out.println("i++： " + (end-start));
    }

    static void test2() {
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000000; ++i) {
            String s = "s";
            s += 1;
        }
        long end = System.currentTimeMillis();
        System.out.println("++i： " + (end-start));
    }
}
