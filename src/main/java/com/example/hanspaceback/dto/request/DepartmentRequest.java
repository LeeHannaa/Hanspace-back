package com.example.hanspaceback.dto.request;

import lombok.Data;

@Data
public class DepartmentRequest {
    private String siteName;
    private String deptName;
    private String logo;
    private String color;
    private boolean userAccept;
    private int maxRserveCount;
    private String link;
    private String firstInfo;
    private String secondInfo;
    private String siteInfoTitle;
    private String siteInfoDetail;
}