package itmo.lab2;

public class Project {
    private String projectName;
    private String customer;
    private double cost;
    private boolean realized;

    public Project(){
    }
    public Project(String projectName, String customer, double cost, boolean realized){
        this.projectName = projectName;
        this.customer = customer;
        this.cost = cost;
        this.realized = realized;
    }
    public String getProjectName(){
        return projectName;
    }
    public void setProjectName(String projectName){
        this.projectName = projectName;
    }
    public String getCustomer(){
        return customer;
    }
    public void setCustomer(String customer){
        this.customer = customer;
    }
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isRealized() {
        return realized;
    }

    public void setRealized(boolean realized) {
        this.realized = realized;
    }
    @Override
    public String toString(){
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", customer='" + customer + '\'' +
                ", cost=" + cost +
                ", realized=" + realized +
                '}';
    }
}
