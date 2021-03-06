package com.architectawesome.dataStructureAndAlgorithms.collection.tree;

import java.util.Scanner;

/**
 * Created by renwujie on 2018/06/01 at 0:52
 * <p>
 * reference: https://blog.csdn.net/u013007955/article/details/23866481
 */
public class TestCompletelyBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*while (true) {
            int h = sc.nextInt();
            int monkey = sc.nextInt();
            if (h == 0 && monkey == 0) break;
            int k = 1;
            for (int i = 0; i < h - 1; ++i) {
                if (monkey % 2 == 0) {
                    k = k * 2 + 1;
                    monkey /= 2;
                } else {
                    k *= 2;
                    monkey = (monkey + 1) / 2;
                }
            }
            System.out.println(k);
        }*/
        /**
         * 下面这个是王垠说的尽量不用break和continue的改版，下面这个逻辑的确更清晰，代码易读性也更高。
         */
        while (true) {
            int h = sc.nextInt();
            int monkey = sc.nextInt();

            if (h != 0 || monkey != 0) {
                int k = 1;
                for (int i = 0; i < h - 1; ++i) {
                    if (monkey % 2 == 0) {
                        k = k * 2 + 1;
                        monkey /= 2;
                    } else {
                        k *= 2;
                        monkey = (monkey + 1) / 2;
                    }
                }
                System.out.println(k);
            } else {
                return;
            }
        }
    }
}
