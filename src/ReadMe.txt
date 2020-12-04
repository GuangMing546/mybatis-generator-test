解决的错误：
    1.首先要用MyBatis的逆向工程代码生成器，要得先在pom.xml的插件引入那里，引入这个generator的插件
        还得配置一下你的那个generatorConfig.xml文件的存放位置
    2.然后在generatorConfig.xml里面，的自己改一下配置信息：
        （1）是改mysql驱动，改为自己电脑仓库上面的
        （2）是改连接数据库数据源的东西
        （3）是改生成javabean，mapper接口，mapper映射文件的位置
        （4）是改你想以数据库那张表来生成呢
        （5）是注释掉<property name="suppressAllComments" value="true"/>
                这个代码会让生成的mapper映射文件生成重复的代码，让你运行报错无法生成什么bean的，
                当然无法生成啦，因为你mapper映射文件里面都有重复的id，那它识别不了的啊