package wang.l1n.dormitory.Advice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import wang.l1n.dormitory.mapper.AdviceMapper;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/5/3 16:36
 * @description：
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AdviceTest {

    @Autowired
    private AdviceMapper adviceMapper;

    @Test
    public void testMapper(){
        System.out.println(adviceMapper.selectAllAdvice());
    }
}
