package com.imugen.service;

import com.imugen.BeanFactory;
import com.imugen.dao.VideoDao;

/**
 * @author Daniel Liu 2019/11/6 19:49
 */
public class IVideoService {
//    VideoDao videoDao = new VideoDao();

    public void produceVideo() throws Exception {
        VideoDao videoDao = (VideoDao) BeanFactory.getBean("videoDao");
        videoDao.produceVideo();
    }
}