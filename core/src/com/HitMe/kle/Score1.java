package com.HitMe.kle;

import com.nilunder.bdx.Bdx;
import com.nilunder.bdx.GameObject;
import com.nilunder.bdx.Scene;
import com.nilunder.bdx.Text;

/**
 * Created by samarthhalyal on 27/01/17.
 */
public class Score1 extends Text {
    private Sacky sacky;
    public int score;
    private Scene mainScene;
    private Platform platform;
    private GameObject playButton;

    public void init() {
        Scene mainScene = Bdx.scenes.get("Main");
        sacky = (Sacky) mainScene.objects.get("Sacky");
        platform = (Platform) mainScene.objects.get("Platform");
        playButton = scene.objects.get("Button2");
    }

    public void main() {
        if (sacky.hit("Bottle")) {
            ++score;
            new Score1();
            text(String.format("%03d", score));
        }
        if (platform.hit("Bottle")) {
            score = 0;
        }
        if(Bdx.mouse.clicked(playButton)){
            score = 0;
            text(String.format("%03d", score));
        }
    }
}
