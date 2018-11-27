package com.lin.test.service.impl;

import com.lin.test.entity.HibernateSequence;
import com.lin.test.dao.HibernateSequenceDao;
import com.lin.test.service.MPHibernateSequenceService;
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
public class HibernateSequenceServiceDiy extends ServiceImpl<HibernateSequenceDao, HibernateSequence> implements MPHibernateSequenceService {

}
