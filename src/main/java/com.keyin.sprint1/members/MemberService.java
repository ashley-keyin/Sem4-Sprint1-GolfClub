package com.keyin.sprint1.members;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    public String getMember(){
        return "Hi it's Brad Rice";
    }
}
