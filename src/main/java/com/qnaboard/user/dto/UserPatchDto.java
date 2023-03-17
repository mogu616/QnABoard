package com.qnaboard.user.dto;

import lombok.Getter;

@Getter
public class UserPatchDto {

    private long memberId;
    private String email;
    private String name;
    private String phone;

}
