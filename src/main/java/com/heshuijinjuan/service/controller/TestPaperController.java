package com.heshuijinjuan.service.controller;

import com.heshuijinjuan.service.common.fe.TestPaperDto;
import com.heshuijinjuan.service.service.TestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 组稿页面
 */
@RestController
@RequestMapping("/testPaper")
public class TestPaperController {
    @Autowired
    private TestPaperService testPaperService;

    @RequestMapping("/add")
    public String add(TestPaperDto testPaperDto) {
        testPaperService.add(testPaperDto);
        return "success";
    }

    @RequestMapping("/getAll")
    public List<TestPaperDto> getAll() {
        return testPaperService.getAll();
    }

    @RequestMapping("/delete")
    public String delete(Long id) {
        testPaperService.delete(id);
        return "success";
    }
}
