package com.bebrikmods.nazarweaponary.entities.tools.tool_items;

import com.bebrikmods.nazarweaponary.entities.status_effects.ExpStatusEffect;
import com.bebrikmods.nazarweaponary.entities.tools.tool_materials.AmethystToolMaterial;
import com.bebrikmods.nazarweaponary.entities.tools.tool_materials.RubyToolMaterial;
import com.bebrikmods.nazarweaponary.init.registrators.ItemRegistrator;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;

public class AmethystSword extends ModSword{
    public AmethystSword(String path) {
        super(new AmethystToolMaterial(), 5, -1.0F, StatusEffects.STRENGTH, new ExpStatusEffect());
        ItemRegistrator.addItem(path, this);
    }

}