package com.json.jsonUtil.gson;

import com.google.gson.Gson;
import org.junit.Test;

/**
 * @Author: yangsheng
 * @Description:
 * @Date: Created in 上午 10:18 2019-01-23
 */
public class GSONTest {
    @Test

    public void test() {

        Gson gson = new Gson();



        Person person = new Person();

        person.setName("zhangsan");

        person.setAge(20);



        String json = gson.toJson(person);

        // {"name":"zhangsan","age":20}

        System.out.println(json);

        Person fromJson = gson.fromJson(json, Person.class);

        // Person [name=zhangsan, age=20]

        System.out.println(fromJson);

    }
}
