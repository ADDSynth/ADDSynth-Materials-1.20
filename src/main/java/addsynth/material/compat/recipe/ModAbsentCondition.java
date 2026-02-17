package addsynth.material.compat.recipe;

import java.util.function.Supplier;
import addsynth.material.ADDSynthMaterials;
import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

/** After constructing this, I realized you can use this condition to run
 *  any kind of test, so it would be pretty cool to have this in ADDSynthCore.
 *  However, we'll keep this here to keep our non-dependency to ADDSynthCore.
 */
public class ModAbsentCondition implements ICondition {

  private final ResourceLocation id;
  private final Supplier<Boolean> test;
  public final Serializer serializer;

  public ModAbsentCondition(final String id, final Supplier<Boolean> test){
    this.id = ADDSynthMaterials.getLocation(id);
    this.test = test;
    serializer = new Serializer(this);
  }

  @Override
  public ResourceLocation getID(){
    return id;
  }

  @Override
  public boolean test(final IContext context){
    return !test.get();
  }

  public static final class Serializer implements IConditionSerializer<ModAbsentCondition> {

    private final ModAbsentCondition condition;

    public Serializer(final ModAbsentCondition condition){
      this.condition = condition;
    }

    @Override
    public final void write(JsonObject json, ModAbsentCondition value){
    }
    
    @Override
    public ModAbsentCondition read(JsonObject json){
      return condition;
    }
    
    @Override
    public ResourceLocation getID(){
      return condition.id;
    }

  }

}
