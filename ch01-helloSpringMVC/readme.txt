ch01-springmvc: springmvc注解式开发

需求： 用户发起一个请求， springmvc接收请求， 显示请求的处理结果(结果页面整一个还原语句)

servlet的实现方式：
       jsp发起----servlet---jsp显示结果


步骤：
1.新建web 应用
2.加入web依赖(pom.xml)
  spring-webmvc依赖（springmvc框架依赖）， servlet依赖。

3.声明springmvc核心对象DispatcherServlet.（web.xml，  /WEB-INF/<servlet-name>-servlet.xml）
  1)DispatcherServlet是一个Servlet对象。
  2)DispatcherServlet叫做前端控制器（front controller）
  3)DispatcherServlet作用：
     1.在servlet的init（）方法中，创建springmvc中的容器对象。
        按照我们之前学过的创建容器对象：
       WebApplicationContext ctx = new ClassPathXmlApplicationContext("appliationContext.xml")
        我们是需要一个配置文件的
        那么一样，我们现在也需要一个配置文件

     2.作为servlet，接收请求。

4.创建一个jsp，发起请求

5.创建一个普通的类，作为控制器使用（代替之前的servlet 写Controller分别对应不同的请求）
  1）在类的上面加入@Controller注解
  2）在类中定义方法， 方法的上面加入@RequestMapping 注解
     方法处理请求的，相当于servlet的doGet, doPost
     一个方法可以对应一个或者多个请求的处理。

6.创建作为结果的jsp页面（在Controller中定义 @RequestMapping  然后建立视图 指定我们对应请求要跳转的视图）


7.创建springmvc的配置文件（spring的配置文件一样  sringmvc.xml
可以在web.xml中指定对应的配置文件xml
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <param-value>classpath:springmvc.xml</param-value>
        </init-param>）
  1）声明组件扫描器，指定@Controller注解所在的包名
  2）声明视图解析器对象，视图解析器是用于帮助处理视图的

8.使用逻辑视图名称
