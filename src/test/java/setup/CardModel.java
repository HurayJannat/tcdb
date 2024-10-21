package setup;

public class CardModel {

    String playerName;
    String sport;
    String brandName;
    String year;
    String setType;
    String setName;
    String teamName;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSetType() {
        return setType;
    }

    public void setSetType(String setType) {
        this.setType = setType;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public CardModel(String sport, String playerName, String brandName, String year, String setType, String setName, String teamName)
    {
        this.playerName=playerName;
        this.playerName=playerName;
        this.brandName=brandName;
        this.year=year;
        this.setType=setType;
        this.setName=setName;
        this.teamName=teamName;
    }
}
