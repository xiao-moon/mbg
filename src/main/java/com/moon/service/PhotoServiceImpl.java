package com.moon.service;

import com.github.pagehelper.PageInfo;
import com.moon.mapper.PhotosTypeMapper;
import com.moon.model.entity.Photos;
import com.moon.model.entity.PhotosType;
import com.moon.model.vo.PhotosTypeVO;
import com.moon.utils.BeanCopierUtil;
import com.moon.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-07-04 21:39
 */
@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private PhotosTypeMapper photosTypeMapper;

    @Override
    public PageInfo findPhotoByType() {
        List<PhotosType> photos = photosTypeMapper.selectPhotoByPhotoType();
        PageInfo pageInfo = new PageInfo(photos);
        List<PhotosTypeVO> list = new ArrayList<>();
        //对分类进行排序
        if (CollectionUtils.isNotEmpty(photos)) {
            photos.sort((pt1, pt2) -> {
                Integer p1 = pt1.getPriority();
                Integer p2 = pt2.getPriority();
                if (p1 > p2) {
                    return -1;
                } else if (p1 < p2) {
                    return 1;
                } else {
                    Date t1 = pt1.getCreateTime();
                    Date t2 = pt2.getCreateTime();

                    if (t1.getTime() > t2.getTime()) {
                        return -1;
                    } else if (t1.getTime() < t2.getTime()) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            });
            //对图片进行排序
            for (PhotosType photo : photos) {
                List<Photos> photosList = photo.getPhotos();
                photosList.sort((pt1, pt2) -> {
                    Date t1 = pt1.getCreateTime();
                    Date t2 = pt2.getCreateTime();
                    if (t1.getTime() > t2.getTime()) {
                        return -1;
                    } else if (t1.getTime() < t2.getTime()) {
                        return 1;
                    } else {
                        return 0;
                    }
                });
            }
            //领域模型转换
            for (PhotosType photo : photos) {
                PhotosTypeVO photosVO = new PhotosTypeVO();
                BeanCopierUtil.transDOToVO(photo, photosVO);
                list.add(photosVO);
            }
        }
        pageInfo.setTotal(list.size());
        pageInfo.setSize(list.size());
        pageInfo.setList(list);
        return pageInfo;
    }
}
