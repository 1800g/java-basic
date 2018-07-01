## Dependency分析
```
public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
```


#### 核心算法?
- 向屏幕输出Hello World。 x
- 正确:将指定内容输出至指定目标。

```
a. System.out---->向那里输出
b. println------->怎么输出
c. "Hello World!"->输出什么

a.b.c是核心算法的依赖（Dependency）
```

## 改造Hello World
- 面向对象化
- 消除Dependency
- 用Guice来配置Dependency

## 面向对象小结
- 从实现角度:精确描述函数干什么
- 从调用者角度:描述调用者需求
- 两者不匹配:需要进行抽象的点
