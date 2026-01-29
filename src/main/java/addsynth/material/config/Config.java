package addsynth.material.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {

  public static ForgeConfigSpec.BooleanValue show_material_info;
  public static ForgeConfigSpec.BooleanValue show_material_description;
  /*
  public static final MaterialDataConfig aluminum  = new MaterialDataConfig("Aluminum");
  public static final MaterialDataConfig brass     = new MaterialDataConfig("Brass");
  public static final MaterialDataConfig bronze    = new MaterialDataConfig("Bronze");
  public static final MaterialDataConfig cobalt    = new MaterialDataConfig("Cobalt");
  public static final MaterialDataConfig invar     = new MaterialDataConfig("Invar");
  public static final MaterialDataConfig lead      = new MaterialDataConfig("Lead");
  // public static final IngotConfig lithium   = new IngotConfig("Lithium");
  public static final MaterialDataConfig neodymium = new MaterialDataConfig("Neodymium");
  public static final MaterialDataConfig nickel    = new MaterialDataConfig("Nickel");
  public static final MaterialDataConfig platinum  = new MaterialDataConfig("Platinum");
  public static final MaterialDataConfig silicon   = new MaterialDataConfig("Silicon");
  public static final MaterialDataConfig silver    = new MaterialDataConfig("Silver");
  public static final MaterialDataConfig steel     = new MaterialDataConfig("Steel");
  public static final MaterialDataConfig tin       = new MaterialDataConfig("Tin");
  public static final MaterialDataConfig titanium  = new MaterialDataConfig("Titanium");
  public static final MaterialDataConfig zinc      = new MaterialDataConfig("Zinc");
  */

  public Config(final ForgeConfigSpec.Builder builder){
    show_material_info        = builder.define("Show Material Basic Info", true);
    show_material_description = builder.define("Show Material Descriptions", false);
  }

}
