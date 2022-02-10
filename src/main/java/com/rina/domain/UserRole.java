package com.rina.domain;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * user_role表所对应的实体类
 *
 * @author arvin
 */
@Data
@Builder
@With
@AllArgsConstructor
@NoArgsConstructor
public class UserRole implements Serializable {

    private static final long serialVersionUID = 457992597942856703L;

    private Long roleId;

    private Long userId;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

}