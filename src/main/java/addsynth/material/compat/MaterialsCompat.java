package addsynth.material.compat;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;

public final class MaterialsCompat {

  public static final class ModID {
    public final String mod_id;
    private ModID(String mod_id){
      this.mod_id = mod_id;
    }
    public final boolean isLoaded(){
      return ModList.get().isLoaded(mod_id);
    }
  }

  // have to do it this way to remove dependency to ADDSynthCore
  public static final ModID addsynthcore          = new ModID("addsynthcore");
  public static final ModID addsynth_energy       = new ModID("addsynth_energy");
  public static final ModID create                = new ModID("create");
  public static final ModID greg_tech             = new ModID("gtceu");
  public static final ModID industrial_craft      = new ModID("ic2"); // latest version (that I could find) is only for MC 1.12
  public static final ModID immersive_engineering = new ModID("immersiveengineering");
  public static final ModID mekanism              = new ModID("mekanism");
  public static final ModID projecte              = new ModID("projecte");
  public static final ModID thermal_foundation    = new ModID("thermal_foundation");
  public static final ModID tinkers_construct     = new ModID("tconstruct");

  public static final boolean SteelModLoaded(){
    return immersive_engineering.isLoaded() || mekanism.isLoaded() ||
           tinkers_construct.isLoaded() || greg_tech.isLoaded();
  }

  public static final boolean BronzeModLoaded(){
    return mekanism.isLoaded() || thermal_foundation.isLoaded() || greg_tech.isLoaded();
  }

  public static final boolean BrassModLoaded(){
    return create.isLoaded() || greg_tech.isLoaded();
  }

  public static final boolean InvarModLoaded(){
    return thermal_foundation.isLoaded() || greg_tech.isLoaded();
  }

  public static final void sendIMCMessages(final InterModEnqueueEvent event){
    if(projecte.isLoaded()){
      ProjectE.register_emc_values();
    }
  }

}
