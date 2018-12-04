//package com.lin.active.controller;
//
//import com.lin.active.model.Book;
//import com.lin.active.model.EmployeeInfo;
//import com.lin.active.service.EmployeeImpl;
//import com.lin.active.service.RabbitmqImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * Created by baozang Cotter on 2018/11/6.
// */
//@RestController
//public class EmployeeController {
//    @Autowired
//    private EmployeeImpl employee;
//
//    @Autowired
//    private RabbitmqImpl rabbitmqImpl;
//
//    @Autowired
//    private MongoTemplate mongoTemplate;
//
//    @RequestMapping(value = "/emp/test" , method = RequestMethod.GET)
//    public EmployeeInfo query(){
//        employee.save();
//        return null;
//    }
//
//    @RequestMapping(value = "/mongo/opr" , method = RequestMethod.GET)
//    public Book opreation(){
//        rabbitmqImpl.sendMsg();
//        return null;
//    }
//}
