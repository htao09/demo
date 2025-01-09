package com.example.demo.service;

import com.example.demo.entity.MemMember;

import java.util.List;

public interface MemMemberService {
    boolean save(MemMember member);

    MemMember getById(String id);

    boolean update(MemMember member);

    boolean deleteById(String id);

    List<MemMember> getAll();
}
