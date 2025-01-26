package keystrokesmod.module.impl.world;

import keystrokesmod.module.Module;
import keystrokesmod.module.setting.impl.SliderSetting;

public class Disabler extends Module {
    private SliderSetting mode;
    private String[] modes = new String[]{"Meow", "Full", "00"};

    public Disabler() {
        super("Disabler", Module.category.world);
        this.registerSetting(mode = new SliderSetting("Mode", 0, modes));
    }

    @Override
    public String getInfo() {
        return modes[(int) mode.getInput()];
    }
}
