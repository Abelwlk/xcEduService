package com.xuecheng.ucenter.dao;

import com.xuecheng.framework.domain.ucenter.XcCompanyUser;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by admin on 2018/2/7.
 */
public interface XcCompanyUserRepository extends JpaRepository<XcCompanyUser, String> {
    XcCompanyUser findXcCompanyUserByUserId(String userId);
}
