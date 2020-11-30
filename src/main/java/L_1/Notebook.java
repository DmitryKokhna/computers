package L_1;

import javax.sound.midi.Soundbank;

public class Notebook extends L_1.PC {
    int displSize;

    public Notebook(int displSize) {
        this.displSize = displSize;
    }

    public Notebook(int cpu, int displSize) {
        this(displSize);
    }

    public Notebook(int cpu, String model, int displSize) {
        super(cpu, model);
        this.displSize = displSize;

    }

    @Override
    public void printPCttx() {
        System.out.print("Процессор - ");
        System.out.println(getCpu());
        System.out.print("Модель - ");
        System.out.println(getModel());
        System.out.print("Монитор - ");
        System.out.println(getDisplSize());
      }

    public int getDisplSize() {
        return displSize;
    }

    public void setDisplSize(int displSize) {
        this.displSize = displSize;
    }

}