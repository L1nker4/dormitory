package wang.l1n.dormitory.service.impl;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.l1n.dormitory.dto.BaseResult;
import wang.l1n.dormitory.entity.Advertisement;
import wang.l1n.dormitory.entity.Manager;
import wang.l1n.dormitory.mapper.AdvertisementMapper;
import wang.l1n.dormitory.mapper.ManagerMapper;
import wang.l1n.dormitory.service.AdvertisementService;

import java.util.Date;
import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2019/5/13 21:11
 * @description：
 */
@Service
public class AdvertisementServiceImpl implements AdvertisementService {

    @Autowired
    private AdvertisementMapper advertisementMapper;

    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public BaseResult insertAdvertisement(Advertisement advertisement) {
        BaseResult baseResult = new BaseResult();
        Manager manager = (Manager) SecurityUtils.getSubject().getPrincipal();
        advertisement.setMid(managerMapper.selectManagerIdByUsername(manager.getUsername()));
        advertisement.setCreateTime(new Date());
        advertisementMapper.insertAdvertisement(advertisement);
        baseResult.setStatus(200);
        baseResult.setMessage("发布成功");
        return baseResult;
    }

    @Override
    public List<Advertisement> getAdvertisementList() {
        return advertisementMapper.getAdvertisementList();
    }
}
