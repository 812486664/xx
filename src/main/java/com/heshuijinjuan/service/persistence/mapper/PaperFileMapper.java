package com.heshuijinjuan.service.persistence.mapper;

import com.heshuijinjuan.service.common.po.PaperFilePo;

/**
 * Created by lihui on 2019/10/14.
 */
public interface PaperFileMapper {
    void add(PaperFilePo paperFilePo);

    PaperFilePo findById(Long paperId);
}
