package ngocvu.example.ontap;

public class LandScape {
    String landImageFileName;
    String landCation;
    String moTa;

    public LandScape(String landImageFileName,String landCation,String moTa ) {
        this.landCation = landCation;
        this.landImageFileName = landImageFileName;
        this.moTa = moTa;
    }

    public String getLandCation() {
        return landCation;
    }

    public void setLandCation(String landCation) {
        this.landCation = landCation;
    }

    public String getLandImageFileName() {
        return landImageFileName;
    }

    public void setLandImageFileName(String landImageFileName) {
        this.landImageFileName = landImageFileName;
    }
    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}