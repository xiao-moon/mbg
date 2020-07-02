package com.moon.controller.content;

import com.fasterxml.jackson.annotation.JsonView;
import com.moon.model.supports.SimpleView;
import com.moon.service.JournalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述: 随笔
 * 创建人: 小月
 * 创建时间: 2020-07-03 01:11
 */
@Api(value = "journal", description = "随笔")
@RestController
@RequestMapping("/journal")
public class JournalController {

    @Autowired
    private JournalService journalService;

    @JsonView(SimpleView.JournalsView.class)
    @GetMapping
    @ApiOperation(value = "获取随笔日记信息")
    public Object getJournal() {
        return journalService.findJournals();
    }
}
