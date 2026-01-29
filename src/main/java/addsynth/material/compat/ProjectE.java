package addsynth.material.compat;

import addsynth.material.ADDSynthMaterials;
import addsynth.material.reference.Material;
import net.minecraftforge.fml.InterModComms;
import moze_intel.projecte.api.imc.CustomEMCRegistration;
import moze_intel.projecte.api.imc.IMCMethods;
import moze_intel.projecte.api.nss.NSSItem;

public final class ProjectE {

  public static final void register_emc_values(){

    final String sender = ADDSynthMaterials.MOD_ID;
    final String mod = MaterialsCompat.projecte.mod_id;
    final String message = IMCMethods.REGISTER_CUSTOM_EMC;
    
    // EMC constants
    final long gemstone             =  8192;
    final long gem_block            = 73728;
    final long common_metal         =   256;
    final long common_metal_block   =  2304;
    final long strong_metal         =   512;
    final long strong_metal_block   =  4608;
    final long uncommon_metal       =  2048;
    final long uncommon_metal_block = 18432;
    final long rare_metal           =  8192;
    final long rare_metal_block     = 73728;
    final long silicon              =  1024;
    
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.RUBY.gem.get()),     gemstone)); // ProjectE defaults to 2024 emc
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.TOPAZ.gem.get()),    gemstone));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.CITRINE.gem.get()),  gemstone));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.SAPPHIRE.gem.get()), gemstone)); // ProjectE defaults to 2024 emc
    
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.RUBY.block.get()),     gem_block));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.TOPAZ.block.get()),    gem_block));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.CITRINE.block.get()),  gem_block));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.SAPPHIRE.block.get()), gem_block));

    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.TIN.ingot.get()),       common_metal));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.ALUMINUM.ingot.get()),  common_metal));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.LEAD.ingot.get()),      common_metal));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.NICKEL.ingot.get()),    common_metal));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.ZINC.ingot.get()),      common_metal));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.SILVER.ingot.get()),    uncommon_metal));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.COBALT.ingot.get()),    uncommon_metal));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.PLATINUM.ingot.get()),  rare_metal));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.TITANIUM.ingot.get()),  rare_metal));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.NEODYMIUM.ingot.get()), rare_metal));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.STEEL.ingot.get()),     strong_metal));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.BRONZE.ingot.get()),    strong_metal));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.BRASS.ingot.get()),     strong_metal));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.INVAR.ingot.get()),     strong_metal));

    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.TIN.block.get()),       common_metal_block));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.ALUMINUM.block.get()),  common_metal_block));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.LEAD.block.get()),      common_metal_block));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.NICKEL.block.get()),    common_metal_block));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.ZINC.block.get()),      common_metal_block));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.SILVER.block.get()),    uncommon_metal_block));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.COBALT.block.get()),    uncommon_metal_block));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.PLATINUM.block.get()),  rare_metal_block));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.TITANIUM.block.get()),  rare_metal_block));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.NEODYMIUM.block.get()), rare_metal_block));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.STEEL.block.get()),     strong_metal_block));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.BRONZE.block.get()),    strong_metal_block));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.BRASS.block.get()),     strong_metal_block));
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.INVAR.block.get()),     strong_metal_block));
    
    if(MaterialsCompat.addsynth_energy.isLoaded()){
      InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.IRON.plate.get()),     common_metal));
      InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.GOLD.plate.get()),     uncommon_metal));
      InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.COPPER.plate.get()),   common_metal));

      InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.TIN.plate.get()),       common_metal));
      InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.ALUMINUM.plate.get()),  common_metal));
      InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.LEAD.plate.get()),      common_metal));
      InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.NICKEL.plate.get()),    common_metal));
      InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.ZINC.plate.get()),      common_metal));
      InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.SILVER.plate.get()),    uncommon_metal));
      InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.COBALT.plate.get()),    uncommon_metal));
      InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.PLATINUM.plate.get()),  rare_metal));
      InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.TITANIUM.plate.get()),  rare_metal));
      InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.NEODYMIUM.plate.get()), rare_metal));
      InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.STEEL.plate.get()),     strong_metal));
      InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.BRONZE.plate.get()),    strong_metal));
      InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.BRASS.plate.get()),     strong_metal));
      InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.INVAR.plate.get()),     strong_metal));
    }
    
    InterModComms.sendTo(sender, mod, message, () -> new CustomEMCRegistration(NSSItem.createItem(Material.SILICON.item.get()), silicon));
  }

}
