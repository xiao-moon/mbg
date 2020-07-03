package com.moon.service.impl;

import com.moon.mapper.TagsMapper;
import com.moon.model.entity.Tags;
import com.moon.model.vo.TagsVO;
import com.moon.service.TagService;
import com.moon.utils.BeanCopierUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * 创建人：小月
 * 创建时间：2020-07-03 12:31
 */
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagsMapper tagsMapper;

    @Override
    public List<TagsVO> findTagsOrderByPriorityAndTime() {
        List<Tags> tags = tagsMapper.selectTagsOrderByPriorityAndTime();
        List<TagsVO> list = new ArrayList<>();

        //领域模型转换
        for (Tags t : tags) {
            TagsVO tagsVO = new TagsVO();
            BeanCopierUtil.transDOToVO(t, tagsVO);
            list.add(tagsVO);
        }

        return list;
    }
}
