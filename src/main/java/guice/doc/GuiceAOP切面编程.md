## Guice AOP
- AOP = Aspect Oriented Programming
- "Aspects"
    - Transaction
    - 日志
    - 安全
    - ...
- 符合AOP Alliance的MethodInterceptor接口
- MethodInterceptor可用于“Aspects”
    - 获得函数调用类,方法,参数...
    - 控制是否执行函数调用

## 实现AOP
- 绑定MethodInterceptor
- 实现MethodInterceptor
- 在MethodInterceptor中注入Dependency
（必须是Guicec创建出来的对象）