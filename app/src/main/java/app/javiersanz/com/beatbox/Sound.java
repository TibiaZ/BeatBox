package app.javiersanz.com.beatbox;

/**
 * Created by TibiaZ on 30/07/2016.
 * This class have an object responsible for keeping track of the filename,
 * the name the user should see, and any other information related to that sound.
 */
public class Sound {

    // Variables

    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    // Constructor

    public Sound(String assetPath){
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");
    }

    // Getters and setters

    public String getAssetPath(){
        return mAssetPath;
    }

    public String getName(){
        return mName;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }
}
