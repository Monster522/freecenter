package com.lin.test.service.impl;

import com.lin.test.entity.Teacher;
import com.lin.test.dao.TeacherDao;
import com.lin.test.service.MPTeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 老师信息表 服务实现类
 * </p>
 *
 * @author baozang
 * @since 2018-11-06
 */
@Service
public class TeacherServiceDiy extends ServiceImpl<TeacherDao, Teacher> implements MPTeacherService {

}
