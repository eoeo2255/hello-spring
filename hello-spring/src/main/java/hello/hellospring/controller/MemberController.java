package hello.hellospring.controller;


import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

                        //  생성자 주입 방식
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


//    @Autowired        //  필드 주입 방식
//    private MemberService memberService;


//    @Autowired        //  세터 주입 방식
//    public void setMemberService(MemberService memberService){
//        this.memberService = memberService;
//    }

}
