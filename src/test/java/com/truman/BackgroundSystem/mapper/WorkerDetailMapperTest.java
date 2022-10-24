package com.truman.BackgroundSystem.mapper;

import com.truman.BackgroundSystem.entity.WorkerDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class WorkerDetailMapperTest {

    @Resource
    WorkerDetailMapper workerDetailMapper;

    @Test
    void test1() {
        List<WorkerDetail> workerDetails = workerDetailMapper.selAllDormKeeperIdName();
        System.out.println(workerDetails);
    }

}