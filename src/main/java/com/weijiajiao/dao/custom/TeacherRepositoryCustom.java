package com.weijiajiao.dao.custom;

import com.weijiajiao.dao.dto.TeacherModel;

import java.util.List;

/**
 * Created by fly on 2017/6/2.
 */
public interface TeacherRepositoryCustom {
    List<TeacherModel> searchTeacherByAreaAndSubject(long areaId, long courseId,int page,int pageSize);
}