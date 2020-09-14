package com.cjean.exercise.exercise01.shiro.realm;

import com.cjean.exercise.exercise01.shiro.entity.User;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.HashSet;
import java.util.Set;

public class ShiroDBRealm extends AuthorizingRealm {

    final String username = "admin";//用户名
    final String password = "d9be323985a51535f6f6c55750f23af5";//用户密码，使用123与wx加密得到

    /**
     * 该方法身份认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取身份
        String username = (String) authenticationToken.getPrincipal();
        //模拟数据库查询
        User user = queryUserByName(username);
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getName(),
                user.getPassword(), // 密码
                ByteSource.Util.bytes(user.getSalt()),
                getName());
        return authenticationInfo;
    }

    /**
     * 用户授权认证
     * 调用时机，在使用Subject中的权限角色验证时，如checkPermission等
     */

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String> roles = new HashSet<>();//角色集合
        Set<String> set = new HashSet<String>();//权限集合
        set.add("test");//添加权限
        set.add("create");//添加权限
        info.setStringPermissions(set);
        System.out.print("权限添加成功");
        return info;
    }

    /**
     * 获取用户信息
     *
     * @param name
     * @return
     */
    public User queryUserByName(String name) {
        User user = new User();
        user.setSalt("wx");
        user.setId("1");
        user.setName(username);
        user.setPassword(password);
        return user;
    }
}
