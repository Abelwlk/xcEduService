package com.xuecheng.ucenter.dao;

import com.xuecheng.framework.domain.ucenter.XcUser;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by mrt on 2018/2/7.
 */
public interface XcUserRepository extends JpaRepository<XcUser, String> {

        XcUser findXcUserByUsername(String username);

}
