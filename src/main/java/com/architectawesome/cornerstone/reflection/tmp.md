# 反射
1. 什么是反射
  - 要了解反射的原理，首先要了解什么是类型信息。Java在运行时识别对象和类的信息，主要有两种方式。
    - 传统的RTTI，它假定我们在编译时已经知道了所有的类型信息
    - 反射机制，允许在运行时发现和使用类的信息
  - Java反射机制都是在运行状态中，对于任意一个类，都能知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法和属性；这种动态获取信息以及动态调用对象的方法的功能称为Java语言的反射机制。
2. 反射主要用途
  - 框架编写
  - ...
3. 反射的基本运用
  - 获取Class对象
    - 对象.getClass()
    - 任何数据类型.class
    - Class.forName(String className)——常用
  - 创建实例
  - 获取field
    - getFiled: 访问公有的成员变量
    - getDeclaredField：所有已声明的成员变量。但不能得到其父类的成员变量
    - getFileds和getDeclaredFields用法同上（参照Method）
  - 获取method
    - 反射main方法
  - 调用method
  - 获取constractor
  - 利用反射创建数组
  - 反射方法的其他使用之——通过反射运行配置文件
    - 读取文件时的路径问题
  - 反射其他用法之---通过反射越过类型检查
    - 泛型用在编译器期，编译过后泛型擦出（消失掉）。所以可以通过反射越过泛型检查。
4. 反射的一些注意事项

> reference1: https://www.cnblogs.com/luoxn28/p/5686794.html  
reference2: https://www.sczyh30.com/posts/Java/java-reflection-1/#%E4%B8%80%E3%80%81%E5%9B%9E%E9%A1%BE%EF%BC%9A%E4%BB%80%E4%B9%88%E6%98%AF%E5%8F%8D%E5%B0%84%EF%BC%9F  
reference3: https://blog.csdn.net/sinat_38259539/article/details/71799078  
reference4: https://www.cnblogs.com/bojuetech/p/5896551.html