package com.example.demo.service.impl;

import com.example.demo.entity.MemMember;
import com.example.demo.mapper.MemMemberMapper;
import com.example.demo.service.MemMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MemMemberServiceImpl extends BaseService<MemMemberMapper, MemMember> implements MemMemberService {
    @Override
    public boolean save(MemMember entity) {
        return super.save(entity);
    }

    @Override
    public MemMember getById(String id) {
        return super.getById(id);
    }

    @Override
    public boolean update(MemMember member) {
      return super.updateById(member);
    }

    @Override
    public boolean deleteById(String id) {
        return super.removeById(id);
    }

    @Override
    public List<MemMember> getAll() {
        return super.list();
    }

    
}
