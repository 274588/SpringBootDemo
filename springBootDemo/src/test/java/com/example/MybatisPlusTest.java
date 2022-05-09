//package com.example;
//
//import com.baomidou.mybatisplus.core.config.GlobalConfig;
//import org.junit.jupiter.api.Test;
//
//public class MybatisPlusTest {
//
//    @Test
//    public void testGenerator() {
////全局配置
//        GlobalConfig config = new GlobalConfig();
//        config.setActiveRecord(true) //是否支持AR模式
//                .setAuthor("weiyunhui") //作者
//                .setOutputDir("D:\\workspace_my\\mp03\\src\\main\\java")
////生成路径
//                .setFileOverride(true)//文件覆盖
//                .setServiceName("%sService") //设置生成的service接口名首字母是否为I
//                .setIdType(IdType.AUTO) //主键策略
//        ;
//
////数据源配置
//        DataSourceConfig dsConfig = new DataSourceConfig();
//        dsConfig.setDbType(DbType.MYSQL)
//                .setUrl("jdbc:mysql://localhost:3306/javaEE_0228")
//                .setDriverName("com.mysql.jdbc.Driver")
//                .setUsername("root")
//                .setPassword("1234");
////策略配置
//        StrategyConfig stConfig = new StrategyConfig();
//        stConfig.setCapitalMode(true) // 全局大写命名
//                .setDbColumnUnderline(true) //表名 字段名 是否使用下滑线命名
//                .setNaming(NamingStrategy.underline_to_camel) // 数据库表映射到实体的命名策略
//                .setInclude("tbl_employee") //生成的表
//                .setTablePrefix("tbl_"); // 表前缀
////包名策略
//        PackageConfig pkConfig = new PackageConfig();
//        pkConfig.setParent("com.atguigu.mp")
//                .setController("controller")
//                .setEntity("beans")
//                .setService("service");
//        AutoGenerator ag = new AutoGenerator().setGlobalConfig(config)
//                .setDataSource(dsConfig)
//                .setStrategy(stConfig)
//                .setPackageInfo(pkConfig);
//        ag.execute();
//    }
//}
