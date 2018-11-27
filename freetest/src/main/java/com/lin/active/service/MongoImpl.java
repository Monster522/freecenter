package com.lin.active.service;

import com.lin.active.model.Book;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by baozang Cotter on 2018/11/20.
 */
@Service
public class MongoImpl {
    @Autowired
    private MongoTemplate mongoTemplate;

    //test
    public void function(){
        //创建集合
        mongoTemplate.createCollection("sboot");
        System.out.println("======= 集合创建成功！======");

        //获取集合
        MongoCollection<Document> freeCol = mongoTemplate.getCollection("fr");
        System.out.println("-------------获取集合fr！---------------");

        //插入文档
        Document doc = new Document();
        doc.append("title","30天放弃JAVA");
        freeCol.insertOne(doc);
        System.out.println("-------------插入文档成功！---------------");

        //查询所有文档
        FindIterable<Document> fi = freeCol.find();
        MongoCursor<Document> mc = fi.iterator();
        while (mc.hasNext()){
            System.out.println(mc.next());
        }
        System.out.println("-------------查询集合freee所有文档！---------------");

        //更新文档'
        freeCol.updateMany(Filters.eq("name","rose"),new Document("name","jalefu"));
        System.out.println("-------------文档更新成功！---------------");

        //删除文档
        freeCol.deleteOne(Filters.eq("name","jalefu"));
        System.out.println("-------------文档删除成功！---------------");

    }

    //创建-插入
    public void save(Book book) {
        mongoTemplate.save(book);
    }
}
