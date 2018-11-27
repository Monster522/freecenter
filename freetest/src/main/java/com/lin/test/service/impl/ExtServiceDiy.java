package com.lin.test.service.impl;

import com.lin.test.entity.Ext;
import com.lin.test.dao.ExtDao;
import com.lin.test.service.MPExtService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author baozang
 * @since 2018-11-06
 */
@Service
public class ExtServiceDiy extends ServiceImpl<ExtDao, Ext> implements MPExtService {

}
