package com.cjean.exercise.exercise01.base.domian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User01 {
    public int id;
    public String name;
    public int age;

}
