package com.yes.impl;

import com.hjhsf.HJHSFProvider;
import com.provider.dto.Student;
import com.provider.hsfclient.Provider;
import com.provider.vo.Teacher;
import org.springframework.stereotype.Component;

/**
 * Created by huangJin on 2023/5/19.
 */
@HJHSFProvider(serviceInterface = Provider.class)
@Component
public class ProviderImpl implements Provider {
    public Teacher test(Student student) {
        System.out.println(student);
        Teacher teacher = new Teacher();
        teacher.setName("huangJin");
        teacher.setStudent(student);
        return teacher;
    }
}
