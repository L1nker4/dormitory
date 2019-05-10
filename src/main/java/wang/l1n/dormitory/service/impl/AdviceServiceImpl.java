package wang.l1n.dormitory.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.l1n.dormitory.entity.Advice;
import wang.l1n.dormitory.mapper.AdviceMapper;
import wang.l1n.dormitory.service.AdviceService;

import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/5/3 16:42
 * @description：
 */
@Service
public class AdviceServiceImpl implements AdviceService {

    @Autowired
    private AdviceMapper adviceMapper;

    /**
     * 获取所有建议
     * @return
     */
    @Override
    public List<Advice> getAllAdvice() {
        return adviceMapper.selectAllAdvice();
    }

    @Override
    public Advice getAdviceById(String aid) {
        return adviceMapper.selectAdviceById(aid);
    }
}
