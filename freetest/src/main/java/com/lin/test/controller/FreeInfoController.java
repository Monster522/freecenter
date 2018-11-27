package com.lin.test.controller;

import com.lin.test.model.Message;
import com.lin.test.service.FreeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by Enzo Cotter on 2018/10/31.
 */
@RestController
public class FreeInfoController {
    @Autowired
    private FreeServiceImpl freeService;

    @RequestMapping(value = "/free/test", method = RequestMethod.GET)
    public Map<String,Object> free(String code){
        Map<String,Object> map = new HashMap<String, Object>();
        if(code.equals("1")){
            throw new NullPointerException();
        }
        map.put("name","Make China Greate!");
        return map;
    }

    @RequestMapping(value = "/free/message", method = RequestMethod.GET)
    public Message freeMessage(){
        System.out.println("-----------Message!------------");
        Message message = new Message();
        message.setMessage("Young People");
        message.setName("roro");
        return message;
    }

    @RequestMapping(value = "/young/test", method = RequestMethod.GET)
    public Map<String,Object> youngTest(){
        freeService.user();
        return null;
    }


}
