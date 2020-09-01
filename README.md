# server-info

#### 介绍
Java获取服务器系统信息

#maven打包命令
mvn clean install -X

#上传到GitHub
<code>
mvn deploy -Dregistry=https://maven.pkg.github.com/zmzhou-star -Dtoken=PAT_TOKEN -X
</code>

#### 软件架构
软件架构说明
依赖：
https://mvnrepository.com/artifact/com.github.oshi/oshi-core
https://mvnrepository.com/artifact/com.alibaba/fastjson
https://mvnrepository.com/artifact/org.apache.commons/commons-lang3

#### 安装教程

1. Add this to pom.xml:
<code>
    <dependency>
      <groupId>com.github.zmzhou</groupId>
      <artifactId>server-info</artifactId>
      <version>1.0</version>
    </dependency>
</code>
2. Run via command line
$ <code>mvn install</code>
#### 使用说明

1.  https://github.com/zmzhou-star/server-info/packages/380676?version=1.0

<code>
ServerInfo serverInfo = new ServerInfo();
</code>

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 码云特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  码云官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
5.  码云官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
