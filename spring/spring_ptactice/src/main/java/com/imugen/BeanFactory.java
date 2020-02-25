package com.imugen;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Daniel Liu 2019/11/6 19:59
 */
public class BeanFactory {
    static Properties prop;

    static {
        try {
            prop = new Properties();
            InputStream is = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            prop.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 为什么返回Obj：获取的类的类型是不确定的
     *
     * @param beanName
     * @return
     * @throws Exception
     */
    public static Object getBean(String beanName) throws Exception {
        String value = prop.getProperty(beanName);
        Object o = Class.forName(value).newInstance();
        return o;
    }
}