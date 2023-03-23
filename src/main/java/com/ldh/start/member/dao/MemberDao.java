package com.ldh.start.member.dao;

import com.ldh.start.member.vo.MemberVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberDao {
    void saveUser(MemberVo memberVo);

    List selectList();
}
