public class App {
    public static void main(String[] args) throws Exception {



        IphoneSettings iphoneSettings = IphoneSettings.getInstance();

        iphoneSettings.setBrightness(150);

        System.out.println("brightness :"   + iphoneSettings.getBrightness()) ;



iphoneSettings.getWiFi();

System.out.println( "Wifi enable "   + iphoneSettings.getWiFi());
}
}