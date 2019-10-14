package com.heshuijinjuan.service.controller;

import com.heshuijinjuan.service.common.fe.FeedbackDto;
import com.heshuijinjuan.service.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 反馈页面
 */
@Controller
@RequestMapping("/feedback")
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    @RequestMapping("/")
    public String feedback() {
        return "feedback";
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(FeedbackDto feedbackDto) {
        feedbackService.add(feedbackDto);
        return "success";
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public Object getAll() {
        return feedbackService.getAll();
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(Long id) {
        feedbackService.delete(id);
        return "success";
    }
}
