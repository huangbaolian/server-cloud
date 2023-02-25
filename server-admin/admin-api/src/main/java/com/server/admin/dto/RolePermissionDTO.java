package com.server.admin.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/13
 */
@Data
@Accessors(chain = true)
public class RolePermissionDTO {
    private Long roleId;
    private List<Long> permissionIds;
    private Long menuId;
}
