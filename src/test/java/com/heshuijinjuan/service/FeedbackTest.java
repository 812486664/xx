package com.heshuijinjuan.service;

import com.heshuijinjuan.service.common.po.FeedbackPo;
import com.heshuijinjuan.service.persistence.mapper.FeedbackMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lihui on 2019/10/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FeedbackTest {

    @Autowired
    private FeedbackMapper feedbackMapper;
    @Test
    public void testAdd() {
        FeedbackPo feedbackPo = new FeedbackPo();
        feedbackMapper.add(feedbackPo);
    }
}
