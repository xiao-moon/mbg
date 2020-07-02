package com.moon.service;

import com.moon.model.entity.Journals;
import com.moon.model.vo.JournalsVO;

import java.util.List;

/**
 * 描述: JournalService
 * 创建人: 小月
 * 创建时间: 2020-07-03 01:23
 */
public interface JournalService {
    List<JournalsVO> findJournals();
}
