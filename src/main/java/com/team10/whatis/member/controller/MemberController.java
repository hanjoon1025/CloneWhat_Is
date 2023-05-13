package com.team10.whatis.member.controller;


import com.team10.whatis.global.dto.ResponseDto;
import com.team10.whatis.member.dto.MemberRequestDto;
import com.team10.whatis.member.service.MemberService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/signup")
    public ResponseDto<?> signup(@RequestBody MemberRequestDto requestDto) {
        return ResponseDto.setSuccess(memberService.signup(requestDto));

    }

    @GetMapping("/login")
    public ResponseDto<?> login(@RequestBody MemberRequestDto.login requestDto, HttpServletResponse response) {
        return ResponseDto.setSuccess(memberService.login(requestDto,response));
    }

    @GetMapping("/auth")
    public ResponseDto<?> authEmail(@RequestBody MemberRequestDto.auth requestDto) {
//       return ResponseDto.setSuccess(memberService.authEmail(requestDto));
        return ResponseDto.setSuccess("TESTING");
    }




}
