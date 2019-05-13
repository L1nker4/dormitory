package wang.l1n.dormitory.mapper;

import wang.l1n.dormitory.entity.Advice;

import java.util.List;

/**
 * @author L1nker4
 */
public interface AdviceMapper{
    /**
     *返回所有建议
     * @return List<Advice>
     */
    List<Advice> selectAllAdvice();

    /**
     * 根据ID获取建议
     * @param aid
     * @return
     */
    Advice selectAdviceById(String aid);

    void addAdvice(Advice advice);

    int getAdviceNum();
}
