package com.example.demo.controller;

import com.example.demo.entity.MemMember;
import com.example.demo.service.MemMemberService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
//@Api(tags = "用户接口")
public class MemMemberController {
    private MemMemberService memMemberService;


    @GetMapping("/member/all")
//    @ApiOperation(value = "获取用户")
    List<MemMember> getAllMemMember() {
        return memMemberService.getAll();

    }

    @GetMapping("/member/{id}")
//    @ApiOperation(value = "获取用户")
    MemMember getMemMember(@PathVariable String id) {
        return memMemberService.getById(id);

    }

    @PostMapping("/member")
//    @ApiOperation(value = "添加用户")
    boolean save(@RequestBody MemMember member) {

        return memMemberService.save(member);

    }

    @PutMapping("/member")
//    @ApiOperation(value = "更新用户")
    boolean update(@RequestBody MemMember member) {

        return memMemberService.update(member);

    }

    @DeleteMapping("/member/{id}")
//    @ApiOperation(value = "获取用户")
    boolean deleteById(@PathVariable String id) {
        return memMemberService.deleteById(id);

    }


}
