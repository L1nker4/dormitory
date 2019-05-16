package wang.l1n.dormitory.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.l1n.dormitory.entity.Malfunction;
import wang.l1n.dormitory.mapper.MalfunctionMapper;
import wang.l1n.dormitory.service.MalfunctionService;

import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/5/15 21:55
 * @description：
 */
@Service
public class MalfunctionServiceImpl implements MalfunctionService {

    @Autowired
    private MalfunctionMapper malfunctionMapper;

    @Override
    public List<Malfunction> getMalfunctionList() {
        return malfunctionMapper.getMalfunctionList();
    }

    @Override
    public Malfunction getMalfunctionDetail(int id) {
        return malfunctionMapper.getMalfunctionDetail(id);
    }
}
