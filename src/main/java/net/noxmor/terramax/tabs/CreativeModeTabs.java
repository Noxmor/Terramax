package net.noxmor.terramax.tabs;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.noxmor.terramax.Terramax;

public class CreativeModeTabs
{
    private static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Terramax.MOD_ID);

    private static final RegistryObject<CreativeModeTab> TERRAMAX_CREATIVE_MODE_TAB = CREATIVE_MODE_TABS.register("terramax_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.GRASS_BLOCK))
                    .title(Component.translatable("creativetab.terramax_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Items.DIAMOND);
                    }).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
