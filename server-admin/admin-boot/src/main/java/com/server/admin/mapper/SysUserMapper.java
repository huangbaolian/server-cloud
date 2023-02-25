package com.server.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.server.admin.dto.UserAuthDTO;
import com.server.admin.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author :Huang Bao Lian
 * @date : 2023/2/13
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    UserAuthDTO getByUsername(@Param("userName") String userName);
}
