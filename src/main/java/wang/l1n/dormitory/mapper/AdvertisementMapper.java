package wang.l1n.dormitory.mapper;

import wang.l1n.dormitory.entity.Advertisement;

import java.util.List;

public interface AdvertisementMapper {
    void insertAdvertisement(Advertisement advertisement);

    List<Advertisement> getAdvertisementList();
}
