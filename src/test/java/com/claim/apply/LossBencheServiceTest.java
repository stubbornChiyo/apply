package com.claim.apply;

import com.claim.apply.entity.LossBenche;
import com.claim.apply.mapper.LossBencheMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @author rui.chi
 * @version 1.0
 * @Description
 * @date 2021/12/8 10:22
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class LossBencheServiceTest {

    @Resource
    private LossBencheMapper lossBencheMapper;

    @Test
    public void test() {
        LossBenche lossBenche = new LossBenche();
        lossBenche.setReportNumber("test");
        lossBenche.setCarBrand("冀J76762");
        lossBenche.setCreatedTime(LocalDateTime.now());
        lossBencheMapper.insert(lossBenche);
    }
}
