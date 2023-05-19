package com.provider.hsfclient;

import com.provider.dto.Student;
import com.provider.vo.Teacher;

/**
 * Created by huangJin on 2023/5/19.
 */
public interface Provider {
    Teacher test(Student student);
}
