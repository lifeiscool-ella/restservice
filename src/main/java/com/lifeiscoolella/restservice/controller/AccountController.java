package com.lifeiscoolella.restservice.controller;

import com.lifeiscoolella.restservice.entity.Member;
import com.lifeiscoolella.restservice.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AccountController {

    @Autowired
    MemberRepository memberRepository;

    @PostMapping("/rest/account/login")
    public int login(
            @RequestBody Map<String, String> params
    ) {
        Member member = memberRepository.findByEmailAndPassword(params.get("email"), params.get("password"));

        if (member != null) {
            return member.getId();
        }
        return 0;
    }

    @GetMapping("/rest/members")
    public List<Member> getMembers() {
        List<Member> members = memberRepository.findAll();
        return members;
    }
}
