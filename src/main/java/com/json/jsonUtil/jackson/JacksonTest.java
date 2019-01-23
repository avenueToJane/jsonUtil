package com.json.jsonUtil.jackson;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.jsonUtil.gson.Person;
import org.junit.Test;

import java.io.IOException;

/**
 * @Author: yangsheng
 * @Description:
 * @Date: Created in 上午 10:24 2019-01-23
 */
public class JacksonTest {
    @Test

    public void test1() throws IOException {

        Person person = new Person();

        person.setName("zhangsan");

        person.setAge(20);



        /**

         * ObjectMapper是JSON操作的核心，Jackson的所有JSON操作都是在ObjectMapper中实现。

         * ObjectMapper有多个JSON序列化的方法，可以把JSON字符串保存File、OutputStream等不同的介质中。

         * writeValue(File arg0, Object arg1)把arg1转成json序列，并保存到arg0文件中。

         * writeValue(OutputStream arg0, Object arg1)把arg1转成json序列，并保存到arg0输出流中。

         * writeValueAsBytes(Object arg0)把arg0转成json序列，并把结果输出成字节数组。

         * writeValueAsString(Object arg0)把arg0转成json序列，并把结果输出成字符串。

         */

        ObjectMapper mapper = new ObjectMapper();



        // User类转JSON

        String json = mapper.writeValueAsString(person);

        // 输出结果：{"name":"zhangsan","age":20}

        System.out.println(json);



        // JSON解析

        Person readValue = mapper.readValue(json, Person.class);

        // 输出结果：Person [name=zhangsan, age=20]

        System.out.println(readValue);

    }
}
