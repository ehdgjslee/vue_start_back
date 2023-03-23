package com.ldh.start.member.vo;

import lombok.Data;

@Data
public class MemberVo {
    private int seq;
    private String mbId;
    private String mbPw;
    private String mbAddr;
    private String mbTel;
    private String useYn;
    private String frstRegDt;
    private String lastChgDt;

}
