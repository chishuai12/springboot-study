### 员工管理系统

1.首页配置：注意点，所有页面的静态资源都需要使用thymeleaf接管。URL @{}
```properties
    # 关闭模板引擎的缓存
    spring.thymeleaf.cache=false
    
    # 设置虚拟目录
    server.servlet.context-path=/kuang
```

mac update
