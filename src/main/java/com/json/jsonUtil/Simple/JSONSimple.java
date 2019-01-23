package com.json.jsonUtil.Simple;



import org.json.simple.JSONArray;

import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;

import org.json.simple.parser.ParseException;

import org.junit.Test;

/**
 * @Author: yangsheng
 * @Description:
 * @Date: Created in 上午 10:02 2019-01-23
 */
public class JSONSimple {
    @Test
    public void test1() throws ParseException {

        // 创建

        JSONObject obj = new JSONObject();

        obj.put("name", "zhangsan");

        obj.put("age", 20);

        obj.put("tel", "15000000000");

        System.out.println(obj);



        // 解析

        JSONParser parser = new JSONParser();

        JSONObject json = (JSONObject) parser.parse(obj.toString());

        System.out.println(json);



        Object name = json.get("name");

        Object age = json.get("age");

        System.out.println("name = " + name + ", age = " + age);



    }
}
