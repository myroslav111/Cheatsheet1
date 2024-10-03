package org.example.objectOrientirung.pc;


/*
1. Erstelle eine abstrakte Klasse 'Hardware' mit den Eigenschaften:
mainboard: String, processor: String, ram: int, hardDrive: String, hardDriveSize: int, graphicsCard: String
2. Erstelle einen Konstruktor, der die folgenden Werte initialisiert:
mainboard = "Asus X1", processor = "Intel i7", ram = 16, hardDrive = "SSD", hardDriveSize = 500, graphicsCard = "Nvidia RTX 2080"
3. Erstelle Getter und Setter für alle Eigenschaften
 */


public abstract class Hardware {
    private String mainboard;
    private String prozessor;
    private int ram;
    private String hardDrive;
    private int hardDriveSize;
    private String graphicsCard;

    public Hardware(){
        this.mainboard = "Asus X1";
        this.prozessor = "Intel i7";
        this.ram = 16;
        this.hardDrive = "SSD";
        this.hardDriveSize = 500;
        this.graphicsCard = "Nvidia RTX 2080";
    }


    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public String getProzessor() {
        return prozessor;
    }

    public void setProzessor(String prozessor) {
        this.prozessor = prozessor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public int getHardDriveSize() {
        return hardDriveSize;
    }

    public void setHardDriveSize(int hardDriveSize) {
        this.hardDriveSize = hardDriveSize;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    //die Methode, die während der Installation einen Speicherplatz reduziert.
    public void installUndReduzSpeicher(int size){
        if (size > hardDriveSize) {
            System.out.println("Freier Speicherplatz auf dem Hard Drive: " + getHardDrive());
            System.out.println("Es gibt nicht genug Speicherplatze für Instalation des Software." +
                    " Sie müssen weitere " + (size - hardDriveSize) + "GB Speicherplatz freimachen.");
        }
        hardDriveSize -= size;

    }

    //die Methode, die während der Deinstallaton einen Speicherplatz vermehrt
    public void uninstallUndFreiSpeicherMach(int size){
        hardDriveSize += size;
        System.out.println(size + " GB Speicherplatz freigemacht. Verfügbarer Speicher: " + hardDriveSize + " GB");
    }
}
