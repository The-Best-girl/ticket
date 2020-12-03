package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class managerType {
    //管理员类别编号
    private Integer managerId;
    //管理员姓名
    private String managerName;
}
