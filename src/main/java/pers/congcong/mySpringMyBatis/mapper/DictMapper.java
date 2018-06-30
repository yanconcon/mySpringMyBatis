package pers.congcong.mySpringMyBatis.mapper;

import org.apache.ibatis.session.RowBounds;
import pers.congcong.mySpringMyBatis.web.model.SysDict;

import java.util.List;

/**
 * Created by 聪聪 on 2018/6/28 0028.
 */
public interface DictMapper {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    SysDict selectByPrimaryKey(Long id);

    /**
     * 条件查询
     * @param sysDict
     * @param rowBounds
     * @return
     */
    List<SysDict> selectBySysDict(SysDict sysDict, RowBounds rowBounds);

    /**
     * 根据id更新
     * @param sysDict
     * @return
     */
    int updateById(SysDict sysDict);

    /**
     * 插入
     * @param sysDict
     * @return
     */
    int insert(SysDict sysDict);

    /**
     *
     * @param id
     * @return
     */
    int deleteById(Long id);
}
