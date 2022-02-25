package com.keyin.sprint1.tournament;

public class Tournament {

    private Long TournamentId;
    private String TournamentStartDate;
    private String TournamentEndDate;
    private String TournamentLocation;
    private double TournamentEntryFee;
    private double CashPrizeAmount;
    private String TournamentParticipants;
    private String FinalStandings;

    public Tournament() {
    }

    public Tournament(Long tournamentId,
                      String tournamentStartDate,
                      String tournamentEndDate,
                      String tournamentLocation,
                      double tournamentEntryFee,
                      double cashPrizeAmount,
                      String tournamentParticipants,
                      String finalStandings) {
        TournamentId = tournamentId;
        TournamentStartDate = tournamentStartDate;
        TournamentEndDate = tournamentEndDate;
        TournamentLocation = tournamentLocation;
        TournamentEntryFee = tournamentEntryFee;
        CashPrizeAmount = cashPrizeAmount;
        TournamentParticipants = tournamentParticipants;
        FinalStandings = finalStandings;
    }

    public Tournament(String tournamentStartDate,
                      String tournamentEndDate,
                      String tournamentLocation,
                      double tournamentEntryFee,
                      double cashPrizeAmount,
                      String tournamentParticipants,
                      String finalStandings) {
        TournamentStartDate = tournamentStartDate;
        TournamentEndDate = tournamentEndDate;
        TournamentLocation = tournamentLocation;
        TournamentEntryFee = tournamentEntryFee;
        CashPrizeAmount = cashPrizeAmount;
        TournamentParticipants = tournamentParticipants;
        FinalStandings = finalStandings;
    }

    public Long getTournamentId() {
        return TournamentId;
    }

    public void setTournamentId(Long tournamentId) {
        TournamentId = tournamentId;
    }

    public String getTournamentStartDate() {
        return TournamentStartDate;
    }

    public void setTournamentStartDate(String tournamentStartDate) {
        TournamentStartDate = tournamentStartDate;
    }

    public String getTournamentEndDate() {
        return TournamentEndDate;
    }

    public void setTournamentEndDate(String tournamentEndDate) {
        TournamentEndDate = tournamentEndDate;
    }

    public String getTournamentLocation() {
        return TournamentLocation;
    }

    public void setTournamentLocation(String tournamentLocation) {
        TournamentLocation = tournamentLocation;
    }

    public double getTournamentEntryFee() {
        return TournamentEntryFee;
    }

    public void setTournamentEntryFee(double tournamentEntryFee) {
        TournamentEntryFee = tournamentEntryFee;
    }

    public double getCashPrizeAmount() {
        return CashPrizeAmount;
    }

    public void setCashPrizeAmount(double cashPrizeAmount) {
        CashPrizeAmount = cashPrizeAmount;
    }

    public String getTournamentParticipants() {
        return TournamentParticipants;
    }

    public void setTournamentParticipants(String tournamentParticipants) {
        TournamentParticipants = tournamentParticipants;
    }

    public String getFinalStandings() {
        return FinalStandings;
    }

    public void setFinalStandings(String finalStandings) {
        FinalStandings = finalStandings;
    }
}

