package com.dianda.tools;

import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * author: youhh
 * date: 2018/6/25 下午6:07
 * description:
 */

/**
 *code is far away from bug with the animal protecting
 *  ┏┓　　　┏┓
 *┏┛┻━━━┛┻┓
 *┃　　　　　　　┃ 　
 *┃　　　━　　　┃
 *┃　┳┛　┗┳　┃
 *┃　　　　　　　┃
 *┃　　　┻　　　┃
 *┃　　　　　　　┃
 *┗━┓　　　┏━┛
 *　　┃　　　┃神兽保佑
 *　　┃　　　┃代码无BUG！
 *　　┃　　　┗━━━┓
 *　　┃　　　　　　　┣┓
 *　　┃　　　　　　　┏┛
 *　　┗┓┓┏━┳┓┏┛
 *　　　┃┫┫　┃┫┫
 *　　　┗┻┛　┗┻┛
 *
 *   @Description : MybatisPlus代码生成器
 *   ---------------------------------
 *   @Author : Liang.Guangqing
 *   @Date : Create in 2017/9/19 14:48　
 */
public class CampaignGenerator {

    public static String OUTPUT_DIR = "/Users/huanhuanyou/dianda/springboot/marketing-campaign/campaign-tools/src/main/java";
    public static String AUTHOR = "youhh";
    public static String TABLE_PREFIX = "";
    public static String PARENT = "cn.dianda.marketing.campaign.orm";
    public static String MODULE_NAME = "";

    public static String[] TABLES_NAMES = new String[]{"broken_logs","campaign","coupon_info","receive_logs","user_coupon","user_info"};

    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        //
        GlobalConfig config = new GlobalConfig();
        config.setOutputDir(OUTPUT_DIR);
        config.setAuthor(AUTHOR);

        config.setFileOverride(true);
        config.setActiveRecord(false); // 不需要ActiveRecord特性的请改为false
        config.setEnableCache(false);  // XML 二级缓存
        config.setBaseResultMap(true);
        config.setBaseColumnList(true);
        config.setKotlin(false);        //是否生成 kotlin 代码

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        // config.setServiceName("MP%sService");
        config.setServiceName("%sService");
//        config.setServiceImplName("%sServiceImpl");
//        config.setControllerName("%Controller");
        config.setMapperName("%sMapper");
        config.setXmlName("%sMapper");
        config.setOpen(true);

        mpg.setGlobalConfig(config);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert() {
            // 自定义数据库表字段类型转换【可选】
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                //System.out.println("转换类型：" + fieldType);
                // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
                return super.processTypeConvert(fieldType);
            }
        });

        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("ok");
        dsc.setUrl("jdbc:mysql://localhost:3306/dd_marketing_campaign?useSSL=false&useUnicode=true&characterEncoding=utf-8");

        mpg.setDataSourceConfig(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setEntityLombokModel(true);
        strategy.setTablePrefix(TABLE_PREFIX);

        //需要生产的表
        strategy.setInclude(TABLES_NAMES);




    }

}
