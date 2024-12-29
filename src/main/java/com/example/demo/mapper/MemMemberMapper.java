package com.example.demo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.MemMember;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员表
 * @author qinxy
 */
@Mapper
public interface MemMemberMapper extends BaseMapper<MemMember> {

}
