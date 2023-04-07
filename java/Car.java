public class Car {

    private int id;
    private String regNum;
    private String model;
    private String ownerName;
    private String phoneNum;
    private int year;
    private boolean inWarranty;

    public Car(String regNum, String model, String ownerName, String phoneNum, int year, boolean inWarranty) {
        this.regNum = regNum;
        this.model = model;
        this.ownerName = ownerName;
        this.phoneNum = phoneNum;
        this.year = year;
        this.inWarranty = inWarranty;
    }

    public String getRegNum() {
        return regNum;
    }
    public String getPhoneNum() {
        return phoneNum;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
