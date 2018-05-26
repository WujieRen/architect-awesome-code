# 数据结构
1. java队列——queue详细解析
        Queue：先进先出(FIFO)的数据结构。与List、Set同一级别，都是继承了Collection接口。
2. LinkedList、ConCurrentLinkedQueue、LinkedBkockingQueue对比分析
3. <a href="https://blog.csdn.net/qq_33642117/article/details/52040345">Set</a>
    - 存储无序不重复的值
    - 对象的相等性
      - 引用到堆上同一对象的两个引用是相等的。如果对两个引用调用hashCode()会得到相同的结果。（默认情况下，Object的hashCode()返回对象的32位jvm内存地址。）因此，如果对象所属的类没有覆盖Object的hashCode()，指向同一对象的引用调用hashCode的值相等，而不同对象的引用的hashCode值是不可能相等的。
      - HashSet不存入重复元素的规则是：hashCode()和equals()。元素的哈希值通过元素的hashCode()方法来获取，hashSet首先会判断两个元素的哈希值，如果哈希值一样，接着会用equals()比较，如果equals()的结果为true，HashSet就将其视为同一个元素，否则反之。
      - HashSet通过hashCode()来确定元素在内存中的位置。一个hashCode位置上可以存放多个元素。
      ![1](imgs/1.png)
      - 当两个引用的equals()不相等时，它们的hashCode()有可能是相等的。然而，对于两个equals()不相等的引用来说，hashCode()也不相同可以提升hash tables的性能。（也就是说，不同对象的hashCode可能相同；假如不同Java对象A和B，A和B不相等（eqauls结果为false），但A和B的哈希码相等，将A和B都存入HashMap时会发生哈希冲突，也就是A和B存放在HashMap内部数组的位置索引相同这时HashMap会在该位置建立一个链接表，将A和B串起来放在该位置，显然，该情况不违反HashMap的使用原则，是允许的。当然，哈希冲突越少越好，尽量采用好的哈希算法以避免哈希冲突。）
      - 所以Java对于hashCode()和equals()是这样规定的：
        - 1.如果两个对象相同，那么它们的hashCode()一定要相同
        - 2.如果两个对象的hashCode()相同，它们不一定相同（这里说的对象相同是指用equals()比较）
        - 3.equals()相等的两个对象，hashCode()一定相同；equals()不想等的两个对象，却并不能证明它们的hashCode()不想等。
    - HashSet和ArrayList集合都有判断元素是否相同的方法，HashSet使用hashCode()和equals()；ArrayList使用equals()。
    - 问题：现有一批数据，要求不能存重复元素，而且要求排序。这种时候就要使用TreeSet了。
          ![2](imgs/2.png)
      - 红黑树是一种典型的二叉树，红黑树算法规则：左小右大。
      - 既然TreeSet可以自然排序，那么TreeSet必定是有排序规则的。
        - 1.元素自身具备比较性。需要实现Comparable接口，重写compareTo()。
        - 2.容器自身具备比较性。定义一个类实现Comparator接口，重写compare方法，并将该接口的子类实例对象作为参数传递给TreeMap集合的构造方法。
        - 注意：当以上两种方式同时存在时，以Comparator比较方式为主。
          ![3](imgs/3.png)
    - LinkedList
        - 会保存插入大的顺序
    - 总结
        - 1.看到array 就要想到 角标
        - 2.看到link 就要想到 first,last
        - 3.看到hash 就要想到 hashCode，equals
        - 4.看到tree 就要想到 Comparable，Comparator
        
> reference1: https://blog.csdn.net/qq_33642117/article/details/52040345  
reference2: http://www.cnblogs.com/qlky/p/7360210.html  
reference3: https://www.cnblogs.com/xudong-bupt/p/3960177.html  
reference4: https://www.cnblogs.com/Qian123/p/5703507.html  
reference5: https://blog.csdn.net/chinayuan/article/details/3345559(读了1/3)

4. <a href="https://blog.csdn.net/zcw4237256/article/details/78266117">List</a>
  - ArrayList
    - 基于数组实现，是一个动态数组，能实现自动扩容。
    - 不是线程安全的，只能在单线程环境下使用。多线程环境下可以考虑使用Collections.synchronizedList(List 1)函数返回一个线程安全的ArrayList类，或者使用concurrent并发包下的CopyOnWriteArrayList类。
    - ArrayList实现了Serializable接口，因此支持序列化，能够实现序列化传输；实现了RandomAccess接口，支持快速随机访问(通过下标访问)；实现了Cloneable接口，能被clone。
    - 每个ArrayList都有一个容量，该容量是指用来存储列表元素的数组的大小。它总是至少等于列表的大小。不断添加元素的过程中，其容量也会自动增长，但是自动增长会导致数组的copy，因此，如果能预知数据量的大小，最好在构造ArrayList时制定其容量。在添加大量元素前，应用程序可以使用ensureCapacity操作来增加ArrayList实例的容量，这样可减少递增式再分配的数量。
      - 注意：此实现不是同步的。如果多个线程同时访问一个Arraylist实例，而其中至少一个线程从结构上修改了列表，那么它必须保持对外同步。
      - 注意扩充容量的方法ensureCapacity。ArrayList在每次增加元素（可能是1个，也可能是一组）时，都要调用该方法来确保足够的容量。当容量不足以容纳当前的元素个数时，就设置新的容量为旧的容量的1.5倍加1，如果设置后的新容量还不够，则直接新容量设置为传入的参数（也就是所需的容量），而后用Arrays.copyof()方法将元素拷贝到新的数组（详见下面的第3点）。从中可以看出，当容量不够时，每次增加元素，都要将原来的元素拷贝到一个新的数组中，非常之耗时，也因此建议在事先能确定元素数量的情况下，才使用ArrayList，否则建议使用LinkedList。
    - 构造方法：注意其三个不同的构造方法。无参构造方法构造的ArrayList的容量默认为10，带有Collection参数的构造方法，将Collection转化为数组赋给ArrayList的实现数组elementData
    - ArrayList基于数组实现，可以通过下标索引直接查找到指定位置的元素，因此查找效率高，但每次插入或删除元素，就要大量地移动元素，插入删除元素的效率低。
    - 在查找给定元素索引值等的方法中，源码都将该元素的值分为null和不为null两种情况处理，ArrayList中允许元素为null
> reference1: https://blog.csdn.net/zcw4237256/article/details/78266117  
reference2: https://blog.csdn.net/wz249863091/article/details/52853360  
  - .clear()
    - .clear会清楚掉list中对象的引用，让这些对象变为垃圾。但是list本身在jvm中的地址不会被清除。
  - .size()返回的是list中元素的个数，和其能容纳的元素个数是两个不同的概念。.clear会empty list，使其size=0，但是list能容纳的元素个数应该是.clear前的个数。

5. <a href="https://baike.xsoftlab.net/view/250.html">Map</a>
  - Map类型
    - 通用Map
      - 用于在应用程序中管理映射，通常在java.util程序包中实现。
      - HashMap、HashTable、Properties、LinkedHashMap、IdentityHashMap、TreeMap、WeakHashMap、ConcurrentHashMap。
    - 专用Map
      - 通常不必亲自创建此类Map，而是通过某些其他类对其进行访问。
      - java.util.jar.Attributes、javax.print.attribute.standard.PrinterStateReasons、java.security.Provider、java.awt.RenderingHints、javax.swing.UIDefaults。
    - 执行实现map
      - 一个用于可以令用户自定义实现自己的Map类的抽象类
      - AbstractMap
  - 常用类型及区别
    - HashMap
      - 最常用。它根据键的hashCode值存储数据，根据键可以直接获取它的值。具有很快的访问速度。HashMap最多只允许一条记录的key为NULL（多条会覆盖），允许多条value为NULL。非同步的。
    - HashTable
      - 与HashMap类似，不同的是：key和value的值均不允许为NULL；它支持线程的同步——即在任一时刻只有一个线程能写HashTablem，因此也导致了HashTable在写入时较慢。
    - TreeMap
      - 能够把它保存的记录根据键(key)排序，默认是按升序排序。也可以指定排序比较器。当用Iterator遍历TreeMap时，得到的记录是排过序的。TreeMap不允许key的值为NULL。非同步的。
    - LinkedHashMap
      - 保存了记录的插入顺序，在用Iterator遍历LinkedHashMap时，先得到的记录肯定是先插入的。遍历速度会比HashMaP慢（因为要寻址）。key和value均允许为空。非同步。
  - 增删改查
    - 插入修改：.put()
    - 删除：.remove()
    - 获取：.get()
    - 清空：.clear()
  - 读取性能比较
  ![](imgs/4.png)
  - 遍历方式
    - 1.增强for循环遍历
    - 2.迭代器遍历
    - 3.遍历性能比较
      - 增强for循环使用方便，但性能较差。不适合处理大规模数据。
      - 迭代器的遍历速度要比增强for循环块很多，是增强for循环的2倍左右。
      - 使用entrySet遍历的速度要比keySet快很多，是keySet的1.5倍左右。
      > Iterator > foreach  
      entreSet > keySet
  - Map排序
    - 按照key排序
      - HashMap、HashTable、LinkedHashMap排序推荐使用Collections.sort(list, new Comparator())自定义排序器。
      - TreeMap推荐通过new TreeMap(new Comparator())方式。
    - 按照value排序
      - 通用Collections.sort(list, new Comparator())自定义排序器实现。
  - 常用API
  ![常用API](imgs/5.png)