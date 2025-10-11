public class Thread_Join extends Thread {

    public static void main(String[] args) throws InterruptedException  {

       try {
         Medical medical = new Medical();
        medical.start();

        medical.join();;

        TestDrive td = new TestDrive();
        td.start();

        td.join();

        OfficerSign os = new OfficerSign();
        os.start();
        os.join();


        LicenseIssued li=new LicenseIssued();
        li.start();
       } catch (Exception e) {
        System.out.println(e);
       }

    }
}

class Medical extends Thread {
    public void run() {

        try {
            System.out.println("Medical Checkup Start... ");
            Thread.sleep(1000);
            System.out.println("Medical Checkup Completed.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class TestDrive extends Thread {
    public void run() {

        try {
            System.out.println("Test Drive Start... ");
            Thread.sleep(1000);
            System.out.println("Test Drive  Completed Successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class OfficerSign extends Thread {
    public void run() {

        try {
            System.out.println("Going For OfficerSign... ");
            Thread.sleep(1000);
            System.out.println("Officer Sign Done .");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class LicenseIssued extends Thread {
    public void run() {

        try {
           Thread.sleep(1000);
           System.out.println("License Issued.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
