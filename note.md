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
    2.列表循环展示

5.添加员工
    1.按钮提交
    2.跳转到添加页面
    3.添加员工成功
    4.返回员工列表页

6.CRUD 搞定

7.404

8.Logout


### 前端
* 模板 别人写好的，我们拿来改成自己需要的
* 框架 组件：自己动手组合拼接！ Bootstrap *LayUI semantic-ui
    
    1.栅格系统

    2.导航栏

    3.侧边栏

    4.表单

# 快速搭建网站

# 1. 前段搞定： 页面长什么样！
# 2. 设计数据库
# 3. 前端让他能够自动运行
# 4. 数据接口如何对接：json，对象 all in one
# 5. 前后端联调测试！

1.有一套自己熟悉的后台模板：工作必要x-admin
2.前端界面：至少自己能够通过前端框架，组合出来一个网站页面
 - index
 - about
 - blog
 - post
 - user
3.让这个网站能够独立运行！
 - 
一个月

