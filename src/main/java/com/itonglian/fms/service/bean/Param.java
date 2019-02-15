package com.itonglian.fms.service.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Param {
    private String taskId;


    public static void main(String[] args) {
        Class c = DocApprovalParam.class;
        Field[] fields = FieldUtils.getAllFields(c);
        for (int i = 0; i <fields.length ; i++) {
            Field field = fields[i];
            System.out.println(field.getName());
            AnnotatedType annotatedType = field.getAnnotatedType();
            System.out.println(annotatedType.getType().getTypeName());
        }
    }
}
