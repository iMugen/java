package com.imugen;

import cn.hutool.cron.CronUtil;
import cn.hutool.cron.task.Task;
import cn.smallbun.screw.core.Configuration;
import cn.smallbun.screw.core.engine.EngineConfig;
import cn.smallbun.screw.core.engine.EngineFileType;
import cn.smallbun.screw.core.engine.EngineTemplateType;
import cn.smallbun.screw.core.execute.DocumentationExecute;
import cn.smallbun.screw.core.process.ProcessConfig;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Liuqiang 2020/8/3 9:04
 */
@Slf4j
public class GenerateDoc {


    public static void main(String[] args) throws InterruptedException {
        CronUtil.schedule("*/7 * * * * *", (Task) GenerateDoc::generateDocTack);

        // 支持秒级别定时任务
        CronUtil.setMatchSecond(true);
        CronUtil.start();
        Thread.sleep(20000);
        CronUtil.stop();
    }


    public static void generateDocTack() {
        List<String> list = Arrays.asList("fscloud", "fscloud-product-eye-demo", "fscloud-service-area", "fscloud-service-enterprise", "fscloud-service-tenant", "fscloud-service-trade");
//        List<String> list = Arrays.asList("c", "test", "test1");

        IntStream.range(0, list.size()).forEach(i -> {
//            String connConfig = "jdbc:mysql://localhost:3306/" + list.get(i) + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String connConfig = "jdbc:mysql://fscloud-middle-outter-test.mysql.cn-chengdu.rds.aliyuncs.com:3306/" + list.get(i) + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//            System.out.println("str = " + connConfig);
            shouldAnswerWithTrue(connConfig);
        });

    }

    /*public static void main(String[] args) {
        List<String> list = Arrays.asList("fscloud", "fscloud-product-eye-demo", "fscloud-service-area", "fscloud-service-enterprise", "fscloud-service-tenant", "fscloud-service-trade");
//        List<String> list = Arrays.asList("c", "test", "test1");111

        IntStream.range(0, list.size()).forEach(i -> {
//            String connConfig = "jdbc:mysql://localhost:3306/" + list.get(i) + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String connConfig = "jdbc:mysql://fscloud-middle-outter-test.mysql.cn-chengdu.rds.aliyuncs.com:3306/" + list.get(i) + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            System.out.println("str = " + connConfig);
            shouldAnswerWithTrue(connConfig);
        });

    }*/

    //        @Test
    public static void shouldAnswerWithTrue(String connConfig) {
        //数据源
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");

        hikariConfig.setJdbcUrl(connConfig);
//        hikariConfig.setUsername("root");
//        hikariConfig.setPassword("root");
//        hikariConfig.setJdbcUrl("jdbc:mysql://fscloud-middle-outter-test.mysql.cn-chengdu.rds.aliyuncs.com:3306/fscloud?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        hikariConfig.setUsername("fscloud");
        hikariConfig.setPassword("46i&jrfeg5tseI&k7#qtjKI(*^*ke");

        //设置可以获取tables remarks信息
        hikariConfig.addDataSourceProperty("useInformationSchema", "true");
        hikariConfig.setMinimumIdle(2);
        hikariConfig.setMaximumPoolSize(5);
        DataSource dataSource = new HikariDataSource(hikariConfig);
        //生成配置
        EngineConfig engineConfig = EngineConfig.builder()
                //生成文件路径
                .fileOutputDir("/Users/database-test")
                //打开目录
                .openOutputDir(true)
                //文件类型 HTML/WORD/MD
                .fileType(EngineFileType.MD)
                //生成模板实现
                .produceType(EngineTemplateType.freemarker).build();
        //忽略表
        ArrayList<String> ignoreTableName = new ArrayList<>();
//        ignoreTableName.add("test_user");
//        ignoreTableName.add("test_group");
        //忽略表前缀
        ArrayList<String> ignorePrefix = new ArrayList<>();
        ignorePrefix.add("test_");
        //忽略表后缀
        ArrayList<String> ignoreSuffix = new ArrayList<>();
        ignoreSuffix.add("_test");
        ProcessConfig processConfig = ProcessConfig.builder()
                //忽略表名
                .ignoreTableName(ignoreTableName)
                //忽略表前缀
                .ignoreTablePrefix(ignorePrefix)
                //忽略表后缀
                .ignoreTableSuffix(ignoreSuffix).build();
        //配置
        Configuration config = Configuration.builder()
                //版本
                .version("1.0.0")
                //描述
                .description("数据库设计文档生成")
                //数据源
                .dataSource(dataSource)
                //生成配置
                .engineConfig(engineConfig)
                //生成配置
                .produceConfig(processConfig).build();
        //执行生成
        new DocumentationExecute(config).execute();
    }

}