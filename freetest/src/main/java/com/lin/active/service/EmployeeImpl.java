package com.lin.active.service;

import com.lin.active.model.EmployeeInfo;
import org.springframework.stereotype.Service;

/**
 * Created by baozang Cotter on 2018/11/6.
 */
@Service
public class EmployeeImpl {

    public void save() {
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setName("linzangbao");
        employeeInfo.setPhoneNum("123456");
        employeeInfo.setWorkPosition("developer");
        employeeInfo.insert();
    }
}
