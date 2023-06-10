public class CarEnc {
    private String make;
    private String model;
    private int year;

    CarEnc(String make,String model,int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    CarEnc(CarEnc x){
        this.copy(x);
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(CarEnc x) {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
