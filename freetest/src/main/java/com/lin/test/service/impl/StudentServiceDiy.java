package com.lin.test.service.impl;

import com.lin.test.entity.Student;
import com.lin.test.dao.StudentDao;
import com.lin.test.service.MPStudentService;
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
public class StudentServiceDiy extends ServiceImpl<StudentDao, Student> implements MPStudentService {

}
