package addsynth.material.reference;

import javax.annotation.Nonnull;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.material.MapColor;

public enum MaterialData {

  // MapColor Quartz is slightly darker than Cloth or Snow
  /* Brightness Scale:
    1 SNOW   = new MapColor(8,  16777215);   (White)
    2 CLOTH  = new MapColor(3,  13092807);
    3 METAL  = new MapColor(6,  10987431);
    4 SILVER = new MapColor(22, 10066329);
    5 STONE  = new MapColor(11,  7368816);
    6 GRAY   = new MapColor(21,  5000268);
  */
  
  // LITHIUM   ("lithium",   "#3 (Li)",   181, MaterialsText.alkali_metal,          null, ??????),
  ALUMINUM  ("aluminum",  "#13 (Al)",  660, MaterialsText.post_transition_metal, null, MapColor.DIAMOND),
  SILICON   ("silicon",   "#14 (Si)", 1414, MaterialsText.metalloid,             null, MapColor.COLOR_GRAY),
  TITANIUM  ("titanium",  "#22 (Ti)", 1668, MaterialsText.transition_metal,      null, MapColor.SNOW),
  COBALT    ("cobalt",    "#27 (Co)", 1495, MaterialsText.transition_metal,      null, MapColor.COLOR_LIGHT_BLUE),
  NICKEL    ("nickel",    "#28 (Ni)", 1455, MaterialsText.transition_metal,      null, MapColor.SAND),
  ZINC      ("zinc",      "#30 (Zn)",  420, MaterialsText.transition_metal,      null, MapColor.METAL),
  SILVER    ("silver",    "#47 (Ag)",  962, MaterialsText.precious_metal,        null, MapColor.WOOL),
  TIN       ("tin",       "#50 (Sn)",  232, MaterialsText.post_transition_metal, null, MapColor.WOOL),
  NEODYMIUM ("neodymium", "#60 (Nd)", 1022, MaterialsText.lanthanide,            null, MapColor.TERRACOTTA_WHITE),
  PLATINUM  ("platinum",  "#78 (Pt)", 1768, MaterialsText.precious_metal,        null, MapColor.ICE),
  LEAD      ("lead",      "#82 (Pb)",  327, MaterialsText.post_transition_metal, null, MapColor.COLOR_GRAY),
  // URANIUM("uranium", MapColor.COLOR_LIGHT_GREEN),

  STEEL ("steel",  null, MapColor.STONE),
  BRONZE("bronze", null, MapColor.RAW_IRON),
  BRASS ("brass",  null, MapColor.GOLD),
  INVAR ("invar",  null, MapColor.SAND),

  ROSE_QUARTZ("rose_quartz", MapColor.COLOR_PINK, 3, 7);

  public final String name;
  public final Component info;
  public final Component type;
  public final Component melts_text;
  public final Component description;
  // public final MaterialDataConfig config;
  public final MapColor block_color;
  @Nonnull
  public final IntProvider oreExperience;

  private MaterialData(String name, MapColor block_color, int min_experience, int max_experience){
    this.name = name;
    this.info = null;
    this.melts_text = null;
    this.type = null;
    this.description = null;
    // this.config = null;
    this.block_color = block_color;
    this.oreExperience = UniformInt.of(min_experience, max_experience);
  }

  // Alloy Metal
  private MaterialData(String name, Object config, MapColor block_color){
    this.name = name;
    this.info        = Component.translatable("gui.addsynth_materials.tooltip."+name+".info").withStyle(ChatFormatting.GRAY);
    this.melts_text = null;
    this.type = null;
    this.description = Component.translatable("gui.addsynth_materials.tooltip."+name+".description").withStyle(ChatFormatting.GRAY);
    // this.config = config;
    this.block_color = block_color;
    this.oreExperience = ConstantInt.ZERO;
  }

  // Metal
  private MaterialData(String name, String info, int melts_at, MutableComponent type, Object config, MapColor block_color){
    this.name = name;
    this.info = Component.literal(info).withStyle(ChatFormatting.GRAY);
    this.melts_text = Component.translatable("gui.addsynth_materials.tooltip.melts", melts_at);
    this.type = type.withStyle(ChatFormatting.GRAY);
    this.description = Component.translatable("gui.addsynth_materials.tooltip."+name+".description").withStyle(ChatFormatting.GRAY);
    // this.config = config;
    this.block_color = block_color;
    this.oreExperience = ConstantInt.ZERO;
  }

}
