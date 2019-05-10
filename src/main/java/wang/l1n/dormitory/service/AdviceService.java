package wang.l1n.dormitory.service;

import wang.l1n.dormitory.entity.Advice;

import java.util.List;

public interface AdviceService {
    /**
     * 获取所有建议
     * @return
     */
    List<Advice> getAllAdvice();

    /**
     * 根据ID获取建议
     * @param aid
     * @return
     */
    Advice getAdviceById(String aid);
}
