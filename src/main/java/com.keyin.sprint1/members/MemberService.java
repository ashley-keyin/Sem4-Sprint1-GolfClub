package com.keyin.sprint1.members;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class MemberService {

    public List<Member> getMembers() {
        return List.of(
                new Member(
                    1,
                    "John Doe",
                    "123 Main Street",
                    "jdoe@mail.com",
                    "7095555555",
                    LocalDate.of(2022, Month.JANUARY, 1),
                    "2 years",
                    "Premium",
                    "Pebble, Scottish",
                    "Pebble, Scottish, British, American",
                    "European"
        )
        );
    }
}