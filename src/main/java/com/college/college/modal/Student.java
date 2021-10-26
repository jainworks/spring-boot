package com.college.college.modal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
public class Student {
    private String sid;
    private String sname;
    private String course;
}
