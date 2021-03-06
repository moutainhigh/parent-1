package com.vankeytech.pmp.auth.mapper;

import com.vankeytech.baseservice.mapper.BasicMapper;
import com.vankeytech.pmp.auth.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xieliang
 */
@Repository
public interface RoleMapper extends BasicMapper<Role> {

    /**
     * 根据用户的id查询角色
     * @param userId 用户id
     * @return
     */
    List<Role> getRoleByUserId(Integer userId);
}