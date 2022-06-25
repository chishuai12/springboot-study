### 员工管理系统

git 创建秘钥 ssh-keygen -t rsa -C chishuai12@163.com

git push git@github.com:chishuai12/springboot-study.git

1.首页配置：注意点，所有页面的静态资源都需要使用thymeleaf接管。URL @{}
```properties
    # 关闭模板引擎的缓存
    spring.thymeleaf.cache=false
    
    # 设置虚拟目录
    server.servlet.context-path=/kuang
```

2.页面国际化
    1.我们需要配置i18n文件
    2.我们如果需要在项目中进行按钮的自动切换，我们需要自定义一个组件LocaleResolver
    3.记得将自己写的组件配置到spring容器中 @bean
    4.#{} 取值

3.登录 + 拦截器

4.员工列表展示
    1.提起公共页面
        1.th:fragment="top-bar"
        2.<div th:insert="~{commons/commons::sidebar(active='main')}"></div>
        3.如果要传递参数，可以直接使用（）传参，接收判断即可！
    2.

