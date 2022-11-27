package com.example.hellospring.service;

import com.example.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class MemberServiceTest {

    MemberService memberService = new MemberService();

    @DisplayName("회원가입 테스트")
    @Test
    void join() {
        // given
        Member member = new Member();
        member.setName("hello");

        // when
        Long saveId = memberService.join(member);

        // then
        Member findMember = memberService.findOne(saveId).get();
        Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @DisplayName("회원 전체 조회 테스트")
    @Test
    void findMembers() {
    }

    @DisplayName("회원 개별 조회 테스트")
    @Test
    void findOne() {
    }
}