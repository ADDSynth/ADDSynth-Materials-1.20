package addsynth.material.compat.recipe;

import addsynth.material.compat.MaterialsCompat;
import net.minecraftforge.common.crafting.CraftingHelper;

public class RecipeConditions {

  public static final ModAbsentCondition  steel_mod_absent = new ModAbsentCondition("steel_mod_absent", MaterialsCompat::SteelModLoaded);
  public static final ModAbsentCondition bronze_mod_absent = new ModAbsentCondition("bronze_mod_absent", MaterialsCompat::BronzeModLoaded);
  public static final ModAbsentCondition  brass_mod_absent = new ModAbsentCondition("brass_mod_absent", MaterialsCompat::BrassModLoaded);
  public static final ModAbsentCondition  invar_mod_absent = new ModAbsentCondition("invar_mod_absent", MaterialsCompat::InvarModLoaded);

  public static final void register(){
    CraftingHelper.register( steel_mod_absent.serializer);
    CraftingHelper.register(bronze_mod_absent.serializer);
    CraftingHelper.register( brass_mod_absent.serializer);
    CraftingHelper.register( invar_mod_absent.serializer);
  }

}
