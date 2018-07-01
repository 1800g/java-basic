## Guice步骤 
- Module

```
继承AbstractModule
重写configure方法
```
- Inject


```
@Inject
注解到构造器上
可以自定义注解@Output

- 构造函数注入
    - 使用final来区分dependency
    - 注入时不要考虑如何实现/绑定
    
- 成员变量注入
    - 用于测试
    - 使用injectMembers来注入测试用例
    
@Inject @Named("dbSpec")private String dbSpec;
@Inject @LogFileName private String logFileName;
- 使用@Named
    - 参数来自配置文件，命令行
    - 或者为了开发方便
```

- Binding

```
- 类名绑定
- 实例绑定
- 连接绑定
- Provider绑定 
- 命名绑定
- 泛型绑定
- 集合绑定

```

- Provider

```
public interface Provider<T>{
    T get();
}

- Lazy loading
    - databaseConnectionProvider.get();
- 多个实例
    - logEntryProvider.get();
- 其他具体场合

@Providers
```
## 如何注入Provider
- 我们可以向Guice请求Provider,不论如何绑定
    - DatabaseConnection dbConn
    - Provider\<DatabaseConnection> dbConnProvider
- 无需自己实现Provider
    - Guice会考虑对象生命周期
    - 需要时可以自己实现Provider


 