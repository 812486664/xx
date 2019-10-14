package com.heshuijinjuan.service.persistence.mapper;

import com.heshuijinjuan.service.common.po.TestPaperPo;

import java.util.List;

/**
 * Created by lihui on 2019/10/13.
 */
public interface TestPaperMapper {
    void add(TestPaperPo testPaperPo);

    List<TestPaperPo> select();

    void delete(Long id);
}
