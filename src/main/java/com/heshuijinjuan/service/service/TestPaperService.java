package com.heshuijinjuan.service.service;

import com.heshuijinjuan.service.common.fe.TestPaperDto;
import com.heshuijinjuan.service.common.po.PaperFilePo;
import com.heshuijinjuan.service.common.po.TestPaperPo;
import com.heshuijinjuan.service.persistence.mapper.PaperFileMapper;
import com.heshuijinjuan.service.persistence.mapper.TestPaperMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lihui on 2019/10/13.
 */
@Service
public class TestPaperService {

    @Autowired
    private TestPaperMapper testPaperMapper;

    @Autowired
    private PaperFileMapper paperFileMapper;

    @Value("${custom.file.path}")
    private String filePath;

    public void add(TestPaperDto testPaperDto) {
        TestPaperPo testPaperPo = new TestPaperPo();
        BeanUtils.copyProperties(testPaperDto, testPaperPo);
        MultipartFile paper = testPaperDto.getPaper();
        if (paper != null) {
            String fileName = paper.getOriginalFilename();
            String contentType = paper.getContentType();
            try {
                String path = filePath + fileName;
                paper.transferTo(new File(path));
                PaperFilePo paperFilePo = new PaperFilePo();
                paperFilePo.setFileName(fileName);
                paperFilePo.setContentType(contentType);
                paperFilePo.setPath(path);
                paperFileMapper.add(paperFilePo);
                testPaperPo.setPaperId(paperFilePo.getId());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        testPaperMapper.add(testPaperPo);
    }

    public List<TestPaperDto> getAll() {
        List<TestPaperDto> dtos = new ArrayList<>();
        List<TestPaperPo> paperPos = testPaperMapper.select();
        for (TestPaperPo po : paperPos) {
            TestPaperDto paperDto = new TestPaperDto();
            BeanUtils.copyProperties(po, paperDto);
            PaperFilePo paperFilePo = paperFileMapper.findById(po.getPaperId());
            paperDto.setPaperFilePo(paperFilePo);
            dtos.add(paperDto);
        }
        return dtos;
    }

    public void delete(Long id) {
        testPaperMapper.delete(id);
    }
}
