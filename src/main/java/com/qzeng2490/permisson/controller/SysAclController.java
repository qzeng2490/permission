package com.qzeng2490.permisson.controller;

import com.google.common.collect.Maps;

import com.qzeng2490.permisson.beans.PageQuery;
import com.qzeng2490.permisson.common.JsonData;
import com.qzeng2490.permisson.param.AclParam;
import com.qzeng2490.permisson.service.SysAclService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sys/acl")
@Slf4j
public class SysAclController {

    @Resource
    private SysAclService sysAclService;
//    @Resource
//    private SysRoleService sysRoleService;

    @RequestMapping("/save.json")
    @ResponseBody
    public JsonData saveAclModule(AclParam param) {
        sysAclService.save(param);
        return JsonData.success();
    }

    @RequestMapping("/update.json")
    @ResponseBody
    public JsonData updateAclModule(AclParam param) {
        sysAclService.update(param);
        return JsonData.success();
    }

    @RequestMapping("/page.json")
    @ResponseBody
    public JsonData list(@RequestParam("aclModuleId") Integer aclModuleId, PageQuery pageQuery) {
        return JsonData.success(sysAclService.getPageByAclModuleId(aclModuleId, pageQuery));
    }

//    @RequestMapping("acls.json")
//    @ResponseBody
//    public JsonData acls(@RequestParam("aclId") int aclId) {
//        Map<String, Object> map = Maps.newHashMap();
//        List<SysRole> roleList = sysRoleService.getRoleListByAclId(aclId);
//        map.put("roles", roleList);
//        map.put("users", sysRoleService.getUserListByRoleList(roleList));
//        return JsonData.success(map);
//    }
}
