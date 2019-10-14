package com.heshuijinjuan.service.persistence.mapper;

import com.heshuijinjuan.service.common.po.FeedbackPo;

import java.util.List;

/**
 * Created by lihui on 2019/10/13.
 */
public interface FeedbackMapper {
    void add(FeedbackPo feedbackPo);

    List<FeedbackPo> select();

    void delete(Long id);
}
