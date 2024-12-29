package com.example.demo.service;

import com.example.demo.entity.MemMember;

public interface MemMemberService {
    boolean save(MemMember member);

    MemMember getById(String id);

    boolean update(MemMember member);

    boolean deleteById(String id);
}
