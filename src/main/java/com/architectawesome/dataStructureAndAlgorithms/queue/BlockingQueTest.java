package com.architectawesome.dataStructureAndAlgorithms.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by renwujie on 2018/05/10 at 20:43
 */
//TODO:其实没明白这个篇的目的是想说明说明问题
//reference:https://www.cnblogs.com/lemon-flm/p/7877898.html
public class BlockingQueTest {

    public static class Basket {
        //篮子，能容纳3个苹果
        BlockingQueue<String> basket = new ArrayBlockingQueue<String>(3);

        //生产苹果放入篮子
        public void produce() throws InterruptedException {
            basket.put("An aple");
        }

        //消费苹果，从篮子中取走
        public String consume() throws InterruptedException {
            String apple = basket.take();
            return apple;
        }

        public int getAppleNumber() {
            return basket.size();
        }
    }

    //测试方法
    public static void testBasket() {
        //建立一个篮子
        final Basket basket = new Basket();

        //苹果生产者
        class Producer implements Runnable {
            public void run() {
                try {
                    while (true) {
                        System.out.println("生产者准备生产苹果");
                        basket.produce();
                        System.out.println("生产者生产完苹果");
                        System.out.println("生产者生产完后还剩-- " + basket.getAppleNumber() + " --个苹果");
                        Thread.sleep(300);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

        //苹果消费者
        class Consumer implements Runnable {
            public void run() {
                try {
                    while (true) {
                        System.out.println("消费者准备消费苹果");
                        basket.consume();
                        System.out.println("消费者消费苹果后还剩-- " + basket.getAppleNumber() + " --个苹果");
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        ExecutorService service = Executors.newCachedThreadPool();
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        //Future<?> submit(Runnable task);
        //提交一个Runnable任务执行，返回一个Future作为任务task的代理，Future.get()方法在执行成功后可以返回结果
        service.submit(producer);
        service.submit(consumer);
        //程序运行10秒后所有任务停止
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.shutdownNow();
    }

    public static void main(String[] args) {
        BlockingQueTest.testBasket();
    }

}
