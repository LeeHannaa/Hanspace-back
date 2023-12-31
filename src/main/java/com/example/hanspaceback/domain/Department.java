package com.example.hanspaceback.domain;

import com.example.hanspaceback.dto.request.DepartmentRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Department extends BaseEntity{
    // NonNull이 필요할까?
    @Id
    @Column(name = "deptId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deptId;
    private String siteName;
    private String deptName;
    private String logo;
//    @ColumnDefault("black")
    private String color;
//    @ColumnDefault("true")
    private boolean userAccept;
//    @ColumnDefault("30")
    private int maxRserveCount;
    private String link;
    private String extraInfo;
    private String siteInfoTitle;
    @Lob
    private String siteInfoDetail;

    public void update(DepartmentRequest request) {
        this.siteName = request.getSiteName();
        this.deptName = request.getDeptName();
        this.logo = request.getLogo();
        this.color = request.getColor();
        this.userAccept = request.isUserAccept();
        this.maxRserveCount = request.getMaxRserveCount();
        this.link = request.getLink();
        this.extraInfo = request.getExtraInfo();
        this.siteInfoTitle = request.getSiteInfoTitle();
        this.siteInfoDetail = request.getSiteInfoDetail();
    }

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<DeptMember> deptMember = new ArrayList<>();


    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Space> space = new ArrayList<>();
}
