public class IphoneSettings  {
private static IphoneSettings instance;

private int brightness;
private boolean isWifiOn = true; 


    private IphoneSettings() {
        // Private constructor
    }

    public static IphoneSettings getInstance() {
        if (instance == null) {
            instance = new IphoneSettings();
        }
        return instance;
    }

boolean getWiFi(){
    return isWifiOn;

}
public void setWifi( boolean isWifiOn){

this.isWifiOn=isWifiOn;


}


  public int getBrightness () {
        return brightness;
    }

    // Setter for author
    public void  setBrightness(int newBrightness) {
        brightness = newBrightness;
    }


}