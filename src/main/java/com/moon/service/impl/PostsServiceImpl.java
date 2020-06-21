package com.moon.service.impl;

import com.moon.model.dto.PhotosDTO;
import com.moon.model.dto.PostsDTO;
import com.moon.model.entity.PostsDO;
import com.moon.model.entity.QPhotosDO;
import com.moon.model.entity.QPostsDO;
import com.moon.repository.PostsRepository;
import com.moon.service.PostsService;
import com.moon.utils.BeanCopierUtil;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-06-17 21:01
 */
@Service
public class PostsServiceImpl implements PostsService {

    @Autowired
    private PostsRepository postsRepository;
    @Autowired
    JPAQueryFactory jpaQueryFactory;


    @Override
    public List<PostsDTO> findAllByPage() {
        List<PostsDO> allByPage = postsRepository.findAllByPage();
        List<PostsDTO> lists = new ArrayList<>();
        for (PostsDO postsDO : allByPage) {
            PostsDTO postsDTO = new PostsDTO();
            BeanCopierUtil.transDOToDTO(postsDO, postsDTO);
            lists.add(postsDTO);
        }
        return lists;
    }

    @Override
    public List<PostsDTO> findAllByPageTest() {
        QPostsDO postsDO = QPostsDO.postsDO;
        QPhotosDO photosDO = QPhotosDO.photosDO;

        List<PostsDTO> collect = jpaQueryFactory
                .select(
                        postsDO.title,
                        postsDO.postsId,
                        photosDO.id,
                        photosDO.description,
                        photosDO.name
                )
                .from(postsDO)
                .join(photosDO)
                .on(postsDO.photoId.eq(photosDO.id))
                .fetch()
                .stream()
                .map(tuple -> PostsDTO.builder()
                        .title(tuple.get(postsDO.title))
                        .postsId(String.valueOf(tuple.get(postsDO.postsId)))
                        .photosDTO(PhotosDTO.builder()
                                .id(String.valueOf(tuple.get(photosDO.id)))
                                .description(tuple.get(photosDO.description))
                                .name(tuple.get(photosDO.name))
                                .build()
                        )
                        .build()
                )
                .collect(Collectors.toList());
        return collect;
    }
}
