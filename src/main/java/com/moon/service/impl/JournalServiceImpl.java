package com.moon.service.impl;

import com.moon.mapper.JournalsMapper;
import com.moon.model.entity.Journals;
import com.moon.model.vo.JournalsVO;
import com.moon.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 描述:
 * 创建人: 小月
 * 创建时间: 2020-07-03 01:26
 */
@Service
public class JournalServiceImpl implements JournalService {
    @Autowired
    private JournalsMapper journalsMapper;

    @Override
    public List<JournalsVO> findJournals() {
        Journals journals = new Journals();
        journals.setStatus(0);
        journals.setDelFlag(0);
        List<Journals> journalsList = journalsMapper.selectJournalsList(journals);
        List<JournalsVO> journalsVOList = new ArrayList<>();
        for (Journals j : journalsList) {
            JournalsVO journalsVO = new JournalsVO();
            journalsVO.setId(String.valueOf(j.getId()));
            journalsVO.setContent(j.getContent());
            journalsVO.setCreateTime((new SimpleDateFormat("yyyy年MM月dd日")).format(j.getCreateTime()));
            journalsVO.setLikes(String.valueOf(j.getLikes()));
            journalsVO.setTemp(j.getCreateTime());
            journalsVOList.add(journalsVO);
        }
        journalsVOList.sort((j1, j2) -> {
            Date t1 = (Date) j1.getTemp();
            Date t2 = (Date) j2.getTemp();
            if (t1.after(t2)) {
                return -1;
            }
            if (t1.before(t2)) {
                return 1;
            }
            return 0;
        });
        return journalsVOList;
    }
}
