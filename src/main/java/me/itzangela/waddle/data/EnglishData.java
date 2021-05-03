package me.itzangela.waddle.data;

import me.itzangela.waddle.Waddle;
import me.itzangela.waddle.common.items.WaddleItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class EnglishData extends LanguageProvider {

    public EnglishData(DataGenerator gen) {
        super(gen, Waddle.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(WaddleItems.HATCHET.get(), "Throwing Hatchet");
    }
}
