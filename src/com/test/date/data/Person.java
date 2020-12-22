package com.test.date.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Person
 * @Description TODO
 * @Author bianliang
 * @Date 2020/4/21 15:38
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

    public String name;
}
