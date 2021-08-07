package com.example.demo;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@Transactional
public class MemberTest {
    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void join()  {
        Member member = new Member();
        member.setName("winter");
        member.setId("elsa");
        member.setOrg("sm");
        member.setActive(true);

        Member 저장된걸로예상되는객체 = memberService.addUser(member);
        Member 찾은멤버 = memberRepository.findById(저장된걸로예상되는객체.getSeq()).get();
        assertEquals(member.getName(), 찾은멤버.getName());
    }
}
