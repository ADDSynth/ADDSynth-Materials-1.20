package addsynth.material.util;

import java.util.List;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;

public class Util {

  // This is a method taken from ADDSynthCore. It is here to prevent dependency.
  // If we need ONE MORE THING from ADDSynthCore, it might as well be a dependnecy.
  /** <p>The Minecraft engine will usually handle new line characters '{@code \n}' in
   *  {@link Component Components}, but one place where it isn't handled correctly is in
   *  ItemStack Tooltips. Newline characters are handled inconsistantly. In cases such
   *  as this, you can use this function. This will split the text Component at the new
   *  line points into separate Components and add them to the List of Components.
   *  <p>Do not use style codes in the text strings as that is generally not supported
   *  anymore, but if you do, be aware that the new Components will not have the same style
   *  as the original, so you'll need to reapply style codes after each new line character.
   * @param components
   * @param text_component
   */
  public static final void addNewLineComponents(final List<Component> components, final Component text_component){
    String text = text_component.getString();
    int position = text.indexOf('\n');
    if(position == -1){
      components.add(text_component);
      return;
    }
    final Style style = text_component.getStyle();
    String first_string;
    do{
      first_string = text.substring(0, position);
      text = text.substring(position+1);
      components.add(Component.literal(first_string).withStyle(style));
      position = text.indexOf('\n');
    }
    while(position >= 0);
    // add last string
    components.add(Component.literal(text).withStyle(style));
  }

}
