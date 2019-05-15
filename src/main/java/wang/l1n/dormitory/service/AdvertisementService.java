package wang.l1n.dormitory.service;

import wang.l1n.dormitory.dto.BaseResult;
import wang.l1n.dormitory.entity.Advertisement;

import java.util.List;

public interface AdvertisementService {
    BaseResult insertAdvertisement(Advertisement advertisement);

    List<Advertisement> getAdvertisementList();
}
