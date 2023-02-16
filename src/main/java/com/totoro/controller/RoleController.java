package com.totoro.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.totoro.constants.Result;
import com.totoro.pojo.Role;
import com.totoro.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 角色管理API
 * @author:totoro
 * @createDate:2023/2/16
 * @description:
 */
@Slf4j
@RestController
@RequestMapping("role")
public class RoleController {

    @Resource
    private RoleService roleService;

    /**
     * 新增角色
     * @param role
     * @return
     */
    @PostMapping("add")
    public Result<Integer> add(@RequestBody @Valid Role role){

        return null;
    }

    /**
     * 根据ID查询角色
     * @param id
     * @return
     */
    @PostMapping("find")
    public Result<Role> add(@RequestParam("id") Long id){

        return null;
    }

    /**
     * 修改角色
     * @param role
     * @return
     */
    @PostMapping("update")
    public Result<Integer> renew(@RequestBody Role role){

        return null;
    }

    /**
     * 分页查询
     * @param role
     * @return
     */
    @PostMapping("page")
    public Result<Page<Role>> page(@RequestBody Role role){

        return null;
    }


    /**
     * 删除角色
     * @param id
     * @return
     */
    @PostMapping("delete")
    public Result<Integer> delete(@RequestParam("id") Long id){

        return null;
    }
}
