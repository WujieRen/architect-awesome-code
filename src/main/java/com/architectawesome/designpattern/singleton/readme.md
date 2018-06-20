# 原理
1. 只产生一个实例。

# 怎么实现
## 怎么保证只产生一个实例？
  - 私有化构造器
  - 私有化后如何获取呢？
    - 提供一个公共的静态方法返回该实例
    - 而且要判断是否已经存在该类的实例了
  - 多线程的问题怎么处理？
    - 直接初始化静态变量
    - 同步方法【但是有缺点，高并发可能导致性能急剧下降，性能低于双重检查加锁】
    - 双重检查加锁【注意关键字<a href="https://www.cnblogs.com/dolphin0520/p/3920373.html">volatile</a>涉及到的东西】

# reference
1. http://www.cnblogs.com/chenssy/p/3170538.html
2. http://www.iocoder.cn/DesignPattern/xiaomingge/Singleton-Pattern/
