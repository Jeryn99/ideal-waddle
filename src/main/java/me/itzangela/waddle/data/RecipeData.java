package me.itzangela.waddle.data;

import me.itzangela.waddle.common.items.WaddleItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Consumer;

public class RecipeData extends RecipeProvider {
    public RecipeData(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(WaddleItems.HATCHET.get()).pattern("SS ").pattern("SW ").pattern(" W ").define('S', Blocks.STONE_SLAB).define('W', Items.STICK).group("waddle").unlockedBy("has_axe", has(Items.STONE_AXE)).save(consumer);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Items.STONE_AXE), WaddleItems.HATCHET.get()).unlocks("has_axe", has(Items.WOODEN_AXE)).save(consumer, "throwing_hatchet");
    }
}
