package addsynth.material.item;

import java.util.List;
import javax.annotation.Nullable;
import addsynth.material.config.Config;
import addsynth.material.reference.MaterialData;
import addsynth.material.util.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class MaterialItem extends Item {

  private final MaterialData data;

  public MaterialItem(final MaterialData data){
    super(new Item.Properties());
    this.data = data;
  }

  @Override
  public final void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltipComponents, TooltipFlag isAdvanced){
    if(Config.show_material_info.get()){
      tooltipComponents.add(data.info);
      if(data.type != null){
        tooltipComponents.add(data.type);
      }
    }
    if(Config.show_material_description.get()){
      Util.addNewLineComponents(tooltipComponents, data.description);
    }
  }

}
