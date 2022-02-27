package com.keyin.sprint1.members;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    public List<Member> getMembers(int id) {
        List<Member> memberList = new ArrayList<Member>();

        memberList.add(new Member(
                1,
                "Ashley Mercer",
                "123 Main Street",
                "amercer@mail.com",
                "7095555555",
                LocalDate.of(2022, Month.JANUARY, 1),
                "2 years",
                "Premium",
                "Pebble, Scottish",
                "Pebble, Scottish, British, American",
                "European"
        ));

        memberList.add(new Member(
                2,
                "Brad Rice",
                "123 Other Main Street",
                "brice@mail.com",
                "7096666666",
                LocalDate.of(2022, Month.FEBRUARY, 1),
                "2 years",
                "Standard",
                "British, American",
                "Pebble, Scottish, British, American",
                "European, Australian"
        ));

        memberList.add(new Member(
                3,
                "Chris Lynch",
                "123 Back Street",
                "clynch@mail.com",
                "7097777777",
                LocalDate.of(2022, Month.JANUARY, 10),
                "2 years",
                "Default",
                "Pebble, American",
                "Pebble, Scottish, British, American",
                "European, Brazil"
        ));

        for (Member member : memberList ) {
            if (member.getMemberId() == id) {
                return List.of(member);
            }
        }
        return null;
    }
}