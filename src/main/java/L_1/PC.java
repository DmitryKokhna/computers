package L_1;

public class PC {
    private int cpu;
    private String model;


    PC(int cpu, String model) {
        this.cpu = cpu;
        this.model = model;
    }

    public PC() {

    }

    public PC(int cpu) {
        this.cpu = cpu;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void printPCttx(){
        System.out.print("Процессор - " + getCpu()+ " МГц");
        System.out.println();
      System.out.println("Модель - Dell/HP");
     //   System.out.println(getModel());
        System.out.println("Характестирики Вашего ПЭВМ");
    }

}