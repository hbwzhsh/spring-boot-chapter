package com.yuqiyu.chapter30.jpa;

import com.yuqiyu.chapter30.bean.GoodInfoBean;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/8/20
 * Time：11:23
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public interface GoodInfoJPA
    extends JpaRepository<GoodInfoBean,Long>
{
    
}
