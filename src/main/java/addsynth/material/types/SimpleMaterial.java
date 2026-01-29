package addsynth.material.types;

import addsynth.material.ADDSynthMaterials;
import addsynth.material.item.MaterialItem;
import addsynth.material.reference.MaterialData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public final class SimpleMaterial {

  private final MaterialData data;
  public final RegistryObject<Item> item;
  public final RegistryObject<Block> ore;
  public final RegistryObject<Block> deepslate_ore;
  
  public SimpleMaterial(final MaterialData data){
    this.data = data;
             item = RegistryObject.create(ResourceLocation.fromNamespaceAndPath(ADDSynthMaterials.MOD_ID, data.name), ForgeRegistries.ITEMS);
              ore = RegistryObject.create(ResourceLocation.fromNamespaceAndPath(ADDSynthMaterials.MOD_ID, data.name+"_ore"), ForgeRegistries.BLOCKS);
    deepslate_ore = RegistryObject.create(ResourceLocation.fromNamespaceAndPath(ADDSynthMaterials.MOD_ID, "deepslate_"+data.name+"_ore"), ForgeRegistries.BLOCKS);
  }

  public final void registerItem(final IForgeRegistry<Item> registry){
    registry.register(item.getId(), data != MaterialData.ROSE_QUARTZ ? new MaterialItem(data) : new Item(new Item.Properties()));
  }

  public final void registerOre(final IForgeRegistry<Block> registry){
    registry.register(          ore.getId(), new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f), data.oreExperience));
    registry.register(deepslate_ore.getId(), new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(4.5f, 3.0f), data.oreExperience));
  }

  public final void registerOreItem(final IForgeRegistry<Item> registry){
    registry.register(          ore.getId(), new BlockItem(          ore.get(), new Item.Properties()));
    registry.register(deepslate_ore.getId(), new BlockItem(deepslate_ore.get(), new Item.Properties()));
  }

}
