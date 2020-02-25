package com.imugen.controller;

import com.imugen.BeanFactory;
import com.imugen.service.IVideoService;

/**
 * @author Daniel Liu 2019/11/6 19:47
 */
public class VideoController {
    public static void main(String[] args) throws Exception {
//        IVideoService iVideoService = new IVideoService();
        IVideoService iVideoService = (IVideoService) BeanFactory.getBean("iVideoService");
        iVideoService.produceVideo();
    }
}