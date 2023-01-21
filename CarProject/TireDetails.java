package tDetails;

public class TireDetails {
    private String company;
    private String design;
    private int width;
    private String position;

    public TireDetails(String company, String design, int width, String position) {
        this.company = company;
        this.design = design;
        this.width = width;
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "TireDetails of the car \n company=" + company + ", design=" + design + ", width=" + width + ", position=" + position
                + "\n";
    }
}

