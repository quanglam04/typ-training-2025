package com.vn.Project_Trainning_Week2.src.dto.response;

import lombok.Builder;

@Builder
public class UserResponse<T> {
    private int code;
    private String message;
    private T data;
}
