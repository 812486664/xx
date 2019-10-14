package com.heshuijinjuan.service.common.fe;

import com.heshuijinjuan.service.common.po.PaperFilePo;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by lihui on 2019/10/13.
 */
public class TestPaperDto {
    private Long id;

    private String subject;

    private String times;

    private String chapter;

    private String province;

    private String version;

    private MultipartFile paper;

    private PaperFilePo paperFilePo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public MultipartFile getPaper() {
        return paper;
    }

    public void setPaper(MultipartFile paper) {
        this.paper = paper;
    }

    public PaperFilePo getPaperFilePo() {
        return paperFilePo;
    }

    public void setPaperFilePo(PaperFilePo paperFilePo) {
        this.paperFilePo = paperFilePo;
    }
}
