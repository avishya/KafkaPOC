package com.home.kafkapoc.model;

import lombok.Data;
@Data
public class UserInfo {
    private String name;
    private String addressLine1;
    private Long zipCode;

    public UserInfo(String name, String addressLine1, Long zipCode) {
        this.name = name;
        this.addressLine1 = addressLine1;
        this.zipCode = zipCode;
    }
}
