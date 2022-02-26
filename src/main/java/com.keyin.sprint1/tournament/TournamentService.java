package com.keyin.sprint1.tournament;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class TournamentService {

    public List<Tournament> getTournament() {
        return List.of(
                new Tournament(
                        1,
                        LocalDate.of(2022, Month.JANUARY, 01),
                        LocalDate.of(2022, Month.JANUARY, 04),
                        "Scotland",
                        200.00,
                        1000.00,
                        "John Doe",
                        "1. John Doe"
                )
        );
    }
}