package com.heshuijinjuan.service.service;

import com.heshuijinjuan.service.common.fe.FeedbackDto;
import com.heshuijinjuan.service.common.po.FeedbackPo;
import com.heshuijinjuan.service.persistence.mapper.FeedbackMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lihui on 2019/10/13.
 */
@Service
public class FeedbackService {
    @Autowired
    private FeedbackMapper feedbackMapper;

    public void add(FeedbackDto feedbackDto) {
        FeedbackPo feedbackPo = new FeedbackPo();
        BeanUtils.copyProperties(feedbackDto, feedbackPo);
        feedbackMapper.add(feedbackPo);
    }

    public List<FeedbackDto> getAll() {
        List<FeedbackPo> pos = feedbackMapper.select();
        List<FeedbackDto> dtos = new ArrayList<>();
        for (FeedbackPo po : pos) {
            FeedbackDto dto = new FeedbackDto();
            BeanUtils.copyProperties(po, dto);
            dtos.add(dto);
        }
        return dtos;
    }

    public void delete(Long id) {
        feedbackMapper.delete(id);
    }
}
