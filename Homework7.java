
abstract class Printer{
    private String model;
    private int printedCount = 0;
    private int availableCount;
    Printer(String m, int a){
        model = m;
        availableCount = a;
    }

    public String getModel() {
        return model;
    }
    public int getAvailableCount() {
        return availableCount;
    }
    public int getPrintedCount() {
        return printedCount;
    }
    public void setAvailableCount(int a){
        availableCount = a;
    }
    public void setPrintedCount(int p){
        printedCount = p;
    }

    public abstract boolean print();
}

class InkjetPrinter extends Printer{
    InkjetPrinter(String m, int a){
        super(m, a);
    }
    @Override
    public boolean print(){
        if(getAvailableCount() == 0){
            setPrintedCount(getPrintedCount()+1);
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족.\n", getModel(), getPrintedCount());
            return false;
        }
        else{
            setAvailableCount(getAvailableCount()-1);
            setPrintedCount(getPrintedCount()+1);
            return true;
        }
    }

}

class LaserPrinter extends Printer{
    LaserPrinter(String m, int a){
        super(m, a);
    }
    @Override
    public boolean print(){
        if(getAvailableCount() == 0){
            setPrintedCount(getPrintedCount()+1);
            System.out.printf("%s: %d매째 인쇄 실패 - 토너 부족.\n", getModel(), getPrintedCount());
            return false;
        }
        else{
            setAvailableCount(getAvailableCount()-1);
            setPrintedCount(getPrintedCount()+1);
            return true;
        }
    }
}

public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}
