# 注意事项
产品族难扩展，产品等级易扩展。

# 元素
1. 同类对象 --> 抽象接口
2. 工厂类 --> 抽象工厂
3. 工厂生产者
4. 调用者

# 关系
1. 同类对象抽象出各自的抽象接口。
2. 抽象工厂决定调用哪个工厂类创建具体对象，返回类型为抽象接口类型。具体子类创建过程对调用者透明。
3. 调用者直接和抽象工厂打交道。抽象工厂调用哪个具体工厂类对调用者透明。

![](https://github.com/WujieRen/architect-awesome-code/raw/master/imgs/designpattern/abstractfactory/1.PNG)