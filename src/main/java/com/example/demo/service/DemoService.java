package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;

@Slf4j
@Service
public class DemoService {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public void connectionTest(){
        try(Connection con = sqlSessionFactory.openSession().getConnection()){
            log.info("커넥션 성공");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public String idToName(String id){

        String name = "";
        if(id.equals("liu")){
            name = "김연우";
        }else if(id.equals("2")){
            name = "뽀삐";
        }else{
            name = "밍키";
        }

        return name;
    }

    public String findService(String name){
        String service = "";
        if(name.equals("김연우")){
            service = "11";
        }else if(name.equals("뽀삐")){
            service = "22";
        }else{
            service = "33";
        }

        return service;
    }

}