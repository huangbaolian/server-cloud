package com.server.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.server.admin.entity.SysPermission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/13
 */
@Mapper
public interface SysPermissionMapper extends BaseMapper<SysPermission> {

    List<SysPermission> listPermRoles();
}
