package com.dianda.tools;


import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.builder.ConfigBuilder;
import org.apache.log4j.Logger;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import javax.sql.DataSource;
import java.util.Iterator;
import java.util.Map;

/**
 * author: youhh
 * date: 2018/6/25 下午6:11
 * description:
 */
public class AutoGenerator {

    private static final Logger LOGGER = Logger.getLogger(AutoGenerator.class);
    private ConfigBuilder configBuilder;
    private InjectionConfig injectionConfig;
    private DataSourceConfig dataSourceConfig;
    private StrategyConfig strategyConfig;
    private PackageConfig packageConfig;
    private TemplateConfig templateConfig;
    private GlobalConfig globalConfig;
    private VelocityEngine engine;


    public void execute() {
        LOGGER.debug("==========================准备生成文件...==========================");
        this.initConfig();
        this.mkdirs(this.configBuilder.getPathInfo());
        Map<String, VelocityContext> ctxData = this.analyzeData(this.configBuilder);
        Iterator<Map.Entry<String, VelocityContext>> it = ctxData.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String, VelocityContext> next = it.next();
            this.batchOutput(next.getKey(), next.getValue());
        }

        if (this.configBuilder.getGlobalConfig().isOpen()) {
            String os = System.getProperty("os.name");
            try {
                if (null != os) {
                    if (os.equals("Mac")) {

                    } else if (os.equals("Windows")) {

                    } else {

                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        LOGGER.debug("==========================文件生完成...==========================");
    }

    private void batchOutput(String key, VelocityContext value) {


    }

    private Map<String, VelocityContext> analyzeData(ConfigBuilder configBuilder) {


        return null;
    }

    private void mkdirs(Map<String,String> pathInfo) {

    }

    private void initConfig() {

    }


    public ConfigBuilder getConfigBuilder() {
        return configBuilder;
    }

    public void setConfigBuilder(ConfigBuilder configBuilder) {
        this.configBuilder = configBuilder;
    }

    public InjectionConfig getInjectionConfig() {
        return injectionConfig;
    }

    public void setInjectionConfig(InjectionConfig injectionConfig) {
        this.injectionConfig = injectionConfig;
    }

    public DataSourceConfig getDataSourceConfig() {
        return dataSourceConfig;
    }

    public void setDataSourceConfig(DataSourceConfig dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
    }

    public StrategyConfig getStrategyConfig() {
        return strategyConfig;
    }

    public void setStrategyConfig(StrategyConfig strategyConfig) {
        this.strategyConfig = strategyConfig;
    }

    public PackageConfig getPackageConfig() {
        return packageConfig;
    }

    public void setPackageConfig(PackageConfig packageConfig) {
        this.packageConfig = packageConfig;
    }

    public TemplateConfig getTemplateConfig() {
        return templateConfig;
    }

    public void setTemplateConfig(TemplateConfig templateConfig) {
        this.templateConfig = templateConfig;
    }

    public GlobalConfig getGlobalConfig() {
        return globalConfig;
    }

    public void setGlobalConfig(GlobalConfig globalConfig) {
        this.globalConfig = globalConfig;
    }

    public VelocityEngine getEngine() {
        return engine;
    }

    public void setEngine(VelocityEngine engine) {
        this.engine = engine;
    }
}
