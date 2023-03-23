package com.ldh.start.member.service;

import com.ldh.start.member.dao.MemberDao;
import com.ldh.start.member.vo.MemberVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    @Autowired
    MemberDao memberDao;
    @Transactional
    public void joinUser(MemberVo memberVo) {
            memberDao.saveUser(memberVo);
    }

    public List selectList() {
        return memberDao.selectList();
    }
}
