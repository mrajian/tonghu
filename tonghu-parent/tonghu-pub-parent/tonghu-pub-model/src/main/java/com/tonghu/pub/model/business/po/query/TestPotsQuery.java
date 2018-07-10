package com.tonghu.pub.model.business.po.query;

import com.tonghu.pub.model.po.BasePaginationQuery;
import lombok.Getter;
import lombok.Setter;

/**
 * @author liangyongjian
 * @desc 点位测试 查询类
 * @create 2018-07-10 17:51
 **/
@Setter
@Getter
public class TestPotsQuery extends BasePaginationQuery {

    private String iotId;
    private String iotProId;
    private String areaId; // 层数

}