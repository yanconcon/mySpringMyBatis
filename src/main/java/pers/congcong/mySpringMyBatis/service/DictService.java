package pers.congcong.mySpringMyBatis.service;

import pers.congcong.mySpringMyBatis.web.model.SysDict;

import java.util.List;

/**
 * Created by 聪聪 on 2018/6/29 0029.
 */
public interface DictService {
    SysDict findById(Long id);

    List<SysDict> findBySysDict(SysDict sysDict, Integer offset, Integer limit);

    boolean saveOrUpdate(SysDict sysDict);

    boolean deleteById(Long id);
}
