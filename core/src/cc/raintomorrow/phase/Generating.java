package cc.raintomorrow.phase;

import cc.raintomorrow.Ecg;
import com.badlogic.gdx.math.MathUtils;

public class Generating {
    static public float intensityFactor(float hp, float maxHp) {
        float halfMaxHp = maxHp / 2;
        return MathUtils.clamp((hp - halfMaxHp) / halfMaxHp + 1, 1, 2);
    }

    static public float unlerp(float value, float min, float max) {
        return MathUtils.clamp((value - min) / (max - min), 0, 1);
    }
}
